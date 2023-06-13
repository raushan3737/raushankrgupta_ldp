package com.zemoso.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
    /*
    forDaoPackage: name of pointcut declaration
    */
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.*(..))")
    public void forDaoPackage() {
    }

    // Create pointcut for getter methods
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.get*(..))")
    public void getter() {
    }

    // Create pointcut for setter methods
    @Pointcut("execution(* com.zemoso.aopdemo.dao.*.set*(..))")
    public void setter() {
    }

    // Create point: include package... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
