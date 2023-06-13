package com.zemoso.aopdemo.dao;

import com.zemoso.aopdemo.entity.Account;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDAO {
    private static final Logger log = LogManager.getLogger(AccountDAO.class);
    private String name;
    private String serviceCode;


    //  Add a new method findAccounts()

    public List<Account> findAccounts(boolean tripWire) {
        // For academic purposes... Simulate an exception
        if (tripWire) {
            throw new RuntimeException("No soup for you !!!");
        }


        List<Account> myAccounts = new ArrayList<>();

        // Create a sample account
        Account temp1 = new Account("Raushan", "Platinum");
        Account temp2 = new Account("Akash", "Diamond");
        Account temp3 = new Account("Satwik", "Gold");


        // Add them to the accounts list
        myAccounts.add(temp1);
        myAccounts.add(temp2);
        myAccounts.add(temp3);

        return myAccounts;

    }


    public void addAccount(Account theAccount, boolean vipFlag) {
        log.info(getClass() + ": ADDING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        log.info(getClass() + ":doWork()");
        return false;
    }

    public String getName() {
        log.info(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        log.info(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        log.info(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        log.info(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
