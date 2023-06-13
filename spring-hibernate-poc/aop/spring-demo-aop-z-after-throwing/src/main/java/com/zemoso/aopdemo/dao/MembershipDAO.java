package com.zemoso.aopdemo.dao;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    private static final Logger log = LogManager.getLogger(MembershipDAO.class);

    public Boolean addMembershipAccount() {
        log.info(getClass() + "DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }

    public void goToSleep() {
        log.info(getClass() + ": I'm going to sleep now...");
    }
}
