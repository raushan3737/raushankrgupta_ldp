package com.zemoso.aopdemo.service;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;


@Component
public class TrafficFortuneService {
    private static final Logger log = LogManager.getLogger(TrafficFortuneService.class);

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

    public String getFortune(boolean tripWire) {

        if (tripWire) {
            log.error("Runtime exception is thrown...");
            throw new RuntimeException("Major accident! Highway is closed!");
        }

        return getFortune();
    }
}
