package com.zemoso.aopdemo.aspect;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    private static final Logger log = LogManager.getLogger(MyDemoLoggingAspect.class);

    @Before("com.zemoso.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        // Custom code that will be executed every time before the public void addAccount() method runs
        log.info("\n====>>> Executing @Before advice on addAccount()");
    }

}
