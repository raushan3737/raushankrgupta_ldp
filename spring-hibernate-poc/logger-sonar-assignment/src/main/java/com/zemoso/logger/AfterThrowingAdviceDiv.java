package com.zemoso.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;

public class AfterThrowingAdviceDiv {
    @AfterThrowing("execution(* springDay4.Calculator.divide(..))")
    public void afterThrowing(JoinPoint joinPoint) {
        Logger log = LogManager.getLogger(AfterThrowingAdviceDiv.class);
        log.info("After Throwing.......");
    }
}