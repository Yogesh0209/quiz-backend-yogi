# Quiz Application Backend

## Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## Features

* Add new quiz questions
* Fetch all questions
* Generate quiz by category
* Submit quiz responses
* Automatic score calculation

## API Endpoints

### 1. Get All Questions

GET /question/all

### 2. Add Question

POST /question/add

### 3. Generate Quiz

GET /quiz/generate?category=Programming&num=3

### 4. Submit Quiz

POST /quiz/submit

## How It Works

* Questions are stored in MySQL database
* Quiz is generated randomly from selected category
* User submits answers
* Backend compares answers and returns score

## Output Example

Score: 3/3

## Author

Yogesh Bhadauriya
