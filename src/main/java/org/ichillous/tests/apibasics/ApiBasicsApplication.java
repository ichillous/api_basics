package org.ichillous.tests.apibasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiBasicsApplication {
/*  Controller -> Service -> Repository -> Database
    The controller receives HTTP requests,
    delegates to the service layer for business logic,
    which in turn uses the repository to interact with the database
*/
    public static void main(String[] args) {
        SpringApplication.run(ApiBasicsApplication.class, args);
    }


}


// TODO: Set up database configuration
//  - Configure application.properties or application.yml
//  - Reason: To establish database connection and set JPA properties


// TODO: Implement error handling
//  - Create custom exceptions
//  - Implement global exception handler
//  - Reason: To provide meaningful error responses and handle exceptions gracefully


// TODO: Implement security (if required)
//  - Set up Spring Security
//  - Implement authentication and authorization
//  - Reason: To secure your API and protect sensitive operations