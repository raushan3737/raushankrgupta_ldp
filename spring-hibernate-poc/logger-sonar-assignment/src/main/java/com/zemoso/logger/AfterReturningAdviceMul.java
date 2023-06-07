package com.zemoso.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class AfterReturningAdviceMul {
    @AfterReturning("execution(* springDay4.Calculator.multiply(..))")
    public void logAfterReturning(JoinPoint joinPoint) {
        Logger log = LogManager.getLogger(AfterReturningAdviceMul.class);
        log.info("Multiplication....");
    }
}