package com.zemoso.springplayground;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    // Add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    // Create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // Will called when the spring inject the dependency
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method- setFortuneService");
        this.fortuneService = fortuneService;
    }


    public void setEmailAddress(String emailAddress) {
        System.out.println(" CricketCoach: inside setter method- setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println(" CricketCoach: inside setter method- setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }


    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 min a day..";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
