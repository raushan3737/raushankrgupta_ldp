package com.zemoso.annotationdemo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
 By use of @Component annotation it will automatically register the component with the spring container and register it
 to the spring container by taking help from component-scanning.

 Spring will automatically create a bean with id theTennisCoach & register it to the spring container by taking help from component-scanning
 */

// Explicit declaration of beanId
//@Component("theTennisCoach")

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
    private static Logger log = LogManager.getLogger(TennisCoach.class);
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        log.info(">>TennisCoach:  inside default constructor");
    }


    // Define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: Inside doMyStartupStuff()");
    }

    // Define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: Inside doMyCleanupStuff()");
    }

    /*
    // Dependency injection via constructor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Practise your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    /*


    // Defining a setter method for setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">>TennisCoach:  inside setFortuneService()");
        this.fortuneService = fortuneService;
    }
    */

    /*

    // Defining a method for setter injection
    // We can inject the dependencies by any method by just adding @Autowired annotation to it.
    @Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">>TennisCoach:  inside doSomeCrazyStuff()");
        this.fortuneService = fortuneService;
    }
     */


}
