package com.zemoso.aopdemo.aspect;

import com.zemoso.aopdemo.entity.Account;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    private static final Logger log = LogManager.getLogger(MyDemoLoggingAspect.class);

    @Before("com.zemoso.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        log.info("\n====>>> Executing @Before advice on method");

        // Display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
        log.info("Method: " + methodSignature);

        // Display the method arguments
        Object[] args = theJoinPoint.getArgs();

        // Loop through args
        for (Object tempArg : args) {
            System.out.println(tempArg);
            if (tempArg instanceof Account) {
                // Downcast and print Account specific details
                Account theAccount = (Account) tempArg;
                log.info("Account name: " + theAccount.getName());
                log.info("Account level: " + theAccount.getLevel());
            }
        }
    }
}
