package com.zemoso.annotationdemo.service;

import com.zemoso.annotationdemo.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // Create an array of strings
    private String[] data = {"1", "2", "3", "4", "5"};


    // Create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // Pick a random string from the array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;

    }
}
