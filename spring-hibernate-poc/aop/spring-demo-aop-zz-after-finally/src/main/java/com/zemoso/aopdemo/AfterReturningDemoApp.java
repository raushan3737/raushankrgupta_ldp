package com.zemoso.aopdemo;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.entity.Account;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterReturningDemoApp {
    private static final Logger log = LogManager.getLogger(AfterReturningDemoApp.class);

    public static void main(String[] args) {
        log.info("Reading the configuration file...");
        // Read spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        log.info("Getting beans from the Spring container..\n");
        // Get the bean from spring configuration
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // Call method to find the accounts
        List<Account> theAccounts = theAccountDAO.findAccounts(false);

        // Display the accounts
        log.info("\n\nMain Program: AfterReturningDemoApp ");
        log.info("--------------------------------");

        log.info(theAccounts+ "\n\n");

        // Close the context
        context.close();
    }

}


