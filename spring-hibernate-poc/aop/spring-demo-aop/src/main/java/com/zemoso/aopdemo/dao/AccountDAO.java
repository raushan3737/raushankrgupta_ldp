package com.zemoso.aopdemo.dao;

import com.zemoso.aopdemo.entity.Account;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private static final Logger log = LogManager.getLogger(AccountDAO.class);

    public void addAccount(Account theAccount, boolean vipFlag) {
        log.info(getClass() + ": ADDING MY DB WORK: ADDING AN ACCOUNT");
    }

    public boolean doWork() {
        log.info(getClass() + ":doWork()");
        return false;
    }
}
