package com.luv2code.springdemo.rest;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//The @ExceptionHandler is an annotation used to handle the specific exceptions and sending the custom responses to the client

@ControllerAdvice
public class CustomerRestExceptionHandler {

    // Add an exception handler for CustomerNotFoundException
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(CustomerNotFoundException exc) {
        // Create CustomerErrorResponse
        ErrorResponse response = new ErrorResponse(HttpStatus.NOT_FOUND.value(),
                exc.getMessage(), System.currentTimeMillis());

        // Return ResponseEntity
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler.. to catch any exceptions (catch all)

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception exc) {
        // Create CustomerErrorResponse
        ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
                exc.getMessage(), System.currentTimeMillis());

        // Return ResponseEntity
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
