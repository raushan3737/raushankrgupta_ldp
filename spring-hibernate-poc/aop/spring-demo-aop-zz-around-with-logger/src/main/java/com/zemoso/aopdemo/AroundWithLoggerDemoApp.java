package com.zemoso.aopdemo;


import com.zemoso.aopdemo.service.TrafficFortuneService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundWithLoggerDemoApp {
    //    private static final Logger log = LogManager.getLogger(AroundWithLoggerDemoApp.class);
    private static final Logger log = Logger.getLogger(AroundWithLoggerDemoApp.class.getName());

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

        log.info("Finished");


        // Close the context
        context.close();
    }

}


