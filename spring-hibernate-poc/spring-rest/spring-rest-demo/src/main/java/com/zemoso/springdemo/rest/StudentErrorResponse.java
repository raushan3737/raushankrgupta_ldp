package com.zemoso.springdemo.rest;

import lombok.Data;

@Data
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public StudentErrorResponse() {
    }

    public StudentErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
