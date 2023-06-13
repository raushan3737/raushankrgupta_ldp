package com.zemoso.aopdemo;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.entity.Account;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterFinallyDemoApp {
    private static final Logger log = LogManager.getLogger(AfterFinallyDemoApp.class);

    public static void main(String[] args) {
        log.info("Reading the configuration file...");
        // Read spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        log.info("Getting beans from the Spring container..\n");
        // Get the bean from spring configuration
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // Call method to find the accounts
        List<Account> theAccounts = null;
        try {
            // Add a boolean flag to simulate an exception
            boolean tripWire = false;
            theAccounts = theAccountDAO.findAccounts(tripWire);

        } catch (Exception exc) {
            log.error("\n\nMain Program... caught exception: " + exc);
        }

        // Display the accounts
        log.info("\n\nMain Program: AfterThrowingDemoApp");

        log.info(theAccounts + "\n\n");

        // Close the context
        context.close();
    }

}


