package com.zemoso.aopdemo.aspect;

import com.zemoso.aopdemo.entity.Account;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    private static final Logger log = LogManager.getLogger(MyDemoLoggingAspect.class);

    @Around("execution(* com.zemoso.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(
            ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        // Print out which method we are advising on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        log.info("\n===>>> Executing @Around on method: " + method);

        // Get begin timestamp
        long beginTime = System.currentTimeMillis();

        // Now, let's execute the method
        Object result = theProceedingJoinPoint.proceed();

        // Get end timestamp
        long endTime = System.currentTimeMillis();

        //Compute duration & display it
        long duration = endTime - beginTime;
        log.info("\n===>>> Duration while method is executing: " + duration / 1000.0);

        return result;
    }

    // Add new advice for @After on the findAccounts method
    // @After will run for success or failure(finally)
    @After("execution(* com.zemoso.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {

        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        log.info("\n===>>> Executing @After (finally) on method: " + method);

    }


    // Add new advice for @AfterThrowing on the findAccounts method
    @AfterThrowing(
            pointcut = "execution(* com.zemoso.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theExc")
    public void afterThrowingFindAccountsAdvice(
            JoinPoint theJoinPoint, Throwable theExc) {

        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        log.info("\n===>>> Executing @AfterThrowing on method:  " + method);

        // log the exception
        log.error("\n===>>>The exception is:  " + theExc);

    }

    // Add new advice for @AfterReturning on the findAccounts method

    @AfterReturning(
            pointcut = "execution(* com.zemoso.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(
            JoinPoint theJoinPoint, List<Account> result) {

        // Print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        log.info("\n===>>> Executing @AfterReturning on method:  " + method);

        // Print out the result of the method call
        log.info("\n===>>> result is:  " + result);

        // Let's post-process the result... Let's modify the result

        // Convert the account name to uppercase
        convertAccountNamesToUpperCase(result);

        log.info("\n===>>> result is:  " + result);

    }

    private void convertAccountNamesToUpperCase(List<Account> result) {
        // Loop through the accounts
        for (Account tempAccount : result) {
            // Get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase();
            // Update the name on the account
            tempAccount.setName(theUpperName);
        }
    }


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
