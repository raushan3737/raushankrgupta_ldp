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

    // Create pointcut for getter methods
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.get*(..))")
    public void getter(){}

    // Create pointcut for setter methods
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.set*(..))")
    public void setter(){}

    // Create point: include package... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter(){}


    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        // Custom code that will be executed every time before the public void addAccount() method runs
        log.info("\n====>>> Executing @Before advice on addAccount()");
    }


    // Reusing the point cut declaration & applying it to the other methods
    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics(){
        log.info("\n===>>> Performing API analytics");
    }

}
