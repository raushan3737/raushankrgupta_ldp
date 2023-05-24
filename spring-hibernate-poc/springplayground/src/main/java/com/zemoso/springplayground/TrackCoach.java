package com.zemoso.springplayground;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    // Custom code that will execute during the Bean lifecycle
    // We can give any method name

    // Add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff ");
    }
    // Add an destroy method

    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method oMyCleanupStuff");
    }
}
