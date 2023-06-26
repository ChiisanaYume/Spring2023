package com.faintdream.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Aspect
@Order(1)
public class SecureAspectj {
    @Before("execution(* com.faintdream.spring6.service..*(..))")
    public void beforeAdvice() throws InterruptedException {
        System.err.print("服务安全准备执行,前置");
        System.err.print("【");
        System.err.print(getClass().getSimpleName());
        System.err.println("】");
        Thread.sleep(5);
    }

    @Order(3)
    @After("execution(* com.faintdream.spring6.service..*(..))")
    public void afterAdvice() throws InterruptedException {
        System.err.print("服务安全执行完成,安全...");
        System.err.print("【");
        System.err.print(getClass().getSimpleName());
        System.err.println("】");
        Thread.sleep(5);
    }
}
