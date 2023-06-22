package com.zemoso.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    // add exception handling code here
    // Add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
        // Create a StudentErrorResponse
        StudentErrorResponse response = new StudentErrorResponse();
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setMessage(exc.getMessage());
        response.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler... to catch exceptions
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
        // Create a StudentErrorResponse

        StudentErrorResponse response = new StudentErrorResponse();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        response.setMessage(exc.getMessage());
        response.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
