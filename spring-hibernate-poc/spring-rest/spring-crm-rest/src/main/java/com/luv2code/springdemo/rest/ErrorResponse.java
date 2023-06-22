package com.luv2code.springdemo.rest;

import lombok.Data;

@Data
public class ErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public ErrorResponse() {
    }

    public ErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
