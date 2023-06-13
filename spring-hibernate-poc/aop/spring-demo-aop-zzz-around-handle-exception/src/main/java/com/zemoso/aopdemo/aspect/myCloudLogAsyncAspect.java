package com.zemoso.aopdemo.aspect;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class myCloudLogAsyncAspect {
    private static final Logger log = LogManager.getLogger(myCloudLogAsyncAspect.class);

    @Before("com.zemoso.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void logToCloudAsync() {
        log.info("\n===>>> Logging to Cloud in async fashion");
    }


}
