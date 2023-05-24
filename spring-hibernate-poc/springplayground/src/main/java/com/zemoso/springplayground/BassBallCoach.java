package com.zemoso.springplayground;

public class BassBallCoach implements Coach {
    // Define a private field for the dependency
    private FortuneService fortuneService ;

    // Define a constructor for dependency injection, the spring will construct the object & pass the dependency
    public BassBallCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public BassBallCoach(){}

    @Override
    public String getDailyWorkout() {
        return "Spend 30min on batting practise";
    }

    @Override
    public String getDailyFortune() {
        // Use my fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
