package com.zemoso.aopdemo;


import com.zemoso.aopdemo.service.TrafficFortuneService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundDemoApp {
    private static final Logger log = LogManager.getLogger(AroundDemoApp.class);

    public static void main(String[] args) {
        log.info("Reading the configuration file...");
        // Read spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        log.info("Getting beans from the Spring container..\n");
        // Get the bean from spring configuration
        TrafficFortuneService theTrafficFortuneService =
                context.getBean("trafficFortuneService", TrafficFortuneService.class);

        log.info("\nMain program: AroundDemoApp");
        log.info("Calling getFortune() method");
        String data = theTrafficFortuneService.getFortune();
        log.info("Data returned by getFortune(): " + data);


        // Close the context
        context.close();
    }

}


