package com.dailycodework.quizonline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())  // Disable CSRF for API
            .authorizeHttpRequests(authz -> authz
                // PERMIT ALL QUIZ ENDPOINTS
                .requestMatchers("/api/quizzes/**").permitAll()
                .requestMatchers("/api/subjects").permitAll()
                // Other public endpoints
                .requestMatchers("/").permitAll()
                .anyRequest().authenticated()  // Login required for other pages
            );
        return http.build();
    }
}
