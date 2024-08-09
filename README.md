# API Basics

A Java Spring Boot application demonstrating the basics of building a RESTful API.

## Description

This project serves as my first Java RESTful API using Java and the Spring Boot framework. It includes basic CRUD (Create, Read, Update, Delete) operations for a `User` entity and demonstrates best practices in structuring a Spring Boot application.

## Features

- RESTful API endpoints for managing users
- Database integration using Spring Data JPA and MySQL
- Request validation and error handling
- Auditing of entity creation and modification timestamps
- Separation of concerns through layered architecture (Controller, Service, Repository)

## Prerequisites

- Java 17 or higher
- MySQL database
- Maven build tool

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/ichillous/api_basics.git
   ```

2. Configure the database connection in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/api_basics?useSSL=false&allowPublicKeyRetrieval=true
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

3. Build and run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the API endpoints using tools like cURL or Postman.

## API Endpoints

- `POST /api/users`: Create a new user
- `GET /api/users/{id}`: Get a user by ID
- `PUT /api/users/{id}`: Update a user
- `DELETE /api/users/{id}`: Delete a user
- `GET /api/users`: Get all users

## Project Structure

- `config`: Configuration classes
- `controller`: REST controllers for handling API requests
- `model`: Entity classes representing database tables
- `repository`: Repositories for data access
- `service`: Service layer for business logic

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Project Lombok](https://projectlombok.org/)