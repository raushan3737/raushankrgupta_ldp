package com.zemoso.aopdemo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class TrafficFortuneService {
    public String getFortune() {
        // Simulate a delay
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return a fortune
        return "Expect Heavy traffic this morning";
    }
}
