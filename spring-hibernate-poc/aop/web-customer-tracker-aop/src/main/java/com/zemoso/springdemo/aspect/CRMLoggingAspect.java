package com.zemoso.springdemo.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
    // Setup logger
    private static final Logger log = LogManager.getLogger(CRMLoggingAspect.class);

    // Setup pointcut declarations
    @Pointcut("execution(* com.zemoso.springdemo.controller.*.*(..))")
    private void forControllerPackage() {
    }

    @Pointcut("execution(* com.zemoso.springdemo.service.*.*(..))")
    private void forServicePackage() {
    }

    @Pointcut("execution(* com.zemoso.springdemo.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow() {
    }

    // Add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint theJoinPoint) {
        // Display the method we are calling
        String theMethodName = theJoinPoint.getSignature().toShortString();
        log.info("===>>> in @Before: calling method " + theMethodName);

        // Display the arguments to the method
        // Get the arguments
        Object[] args = theJoinPoint.getArgs();

        // Loop through and display the arguments
        for (Object arg : args) {
            log.info("===>>> argument: " + arg);
        }
    }


    // Add @AfterReturning advice
    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "theResult")
    public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
        // Display the method we are calling
        String theMethodName = theJoinPoint.getSignature().toShortString();
        log.info("===>>> in  @AfterReturning: from method " + theMethodName);

        // Display data returned
        log.info("===>>> result: " + theResult);
    }
}
