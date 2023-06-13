package com.zemoso.aopdemo.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    private static final Logger log = LogManager.getLogger(MyDemoLoggingAspect.class);

    /*
     forDaoPackage: name of pointcut declaration
     */
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}


    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        // Custom code that will be executed every time before the public void addAccount() method runs
        log.info("\n====>>> Executing @Before advice on addAccount()");
    }


    // Reusing the point cut declaration & applying it to the other methods
    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        log.info("\n===>>> Performing API analytics");
    }

}
