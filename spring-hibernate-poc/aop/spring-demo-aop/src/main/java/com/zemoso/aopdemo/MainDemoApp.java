package com.zemoso.aopdemo;

import com.zemoso.aopdemo.dao.AccountDAO;
import com.zemoso.aopdemo.dao.MembershipDAO;


import com.zemoso.aopdemo.entity.Account;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    // Added support for logging..
    private static final Logger log = LogManager.getLogger(MainDemoApp.class);

    public static void main(String[] args) {
        log.info("Reading the configuration file...");
        // Read spring configuration java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        log.info("Getting beans from the Spring container..");
        // Get the bean from spring configuration
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // Get membership bean from spring configuration
        MembershipDAO membershipDAO =
                context.getBean("membershipDAO", MembershipDAO.class);

        // Call the business method
        Account myAccount = new Account();
        theAccountDAO.addAccount(myAccount, true);
        theAccountDAO.doWork();


        membershipDAO.addMembershipAccount();
        membershipDAO.goToSleep();


        // Close the context
        context.close();
    }
}
