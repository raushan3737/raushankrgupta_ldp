package com.zemoso.aopdemo.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    private static final Logger log = LogManager.getLogger(MyDemoLoggingAspect.class);

    // This is where add all of our related advices for logging
    // Let's start with @Before advice

    //    @Before("execution(public void com.zemoso.aopdemo.dao.AccountDAO.addAccount())")
    //    @Before("execution(public void add*())")
    //     @Before("execution(* add*(Account))")
    //     @Before("execution(* add*(com.zemoso.aopdemo.entity.Account, ..))")
    // com.zemoso.aopdemo.dao  @Before("execution(* add*( .. ))")

    @Before("execution(* com.zemoso.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        // Custom code that will be executed every time before the public void addAccount() method runs
        log.info("\n====>>> Executing @Before advice on addAccount()");
    }
}
