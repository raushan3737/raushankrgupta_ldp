package com.zemoso.annotationdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    // It will get the value from the properties file 
    // Field level injection
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up. ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
