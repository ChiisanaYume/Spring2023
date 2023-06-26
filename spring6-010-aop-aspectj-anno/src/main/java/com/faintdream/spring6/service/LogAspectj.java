package com.faintdream.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Aspect // 标注切面类
@Order(2) // 标注顺序
public class LogAspectj { // 切面

    // 切面 = 通知 + 切点
    // 通知就是具体业务的增强代码(增强)

    // @Before 前置通知 后面跟切面表达式
    @Before("execution(* com.faintdream.spring6.service..*(..))")
    public void beforeAdvice(){
        log("前置通知");
    }

    // @AfterReturning 后置通知 后面跟切点表达式
    @AfterReturning("execution(* com.faintdream.spring6.service..*(..))")
    public void afterReturningAdvice(){
        log("后置通知");
    }

    // @Around 环绕通知 后面跟切点表达式
    @Around("execution(* com.faintdream.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前面的代码
        log("前环绕通知");

        // 获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        // 执行目标(spring会处理空指针异常)
        joinPoint.proceed(args);

        // 后面的代码
        log("后环绕通知");
    }

    @Order(5)
    // @After 最终通知 后面跟切点表示式
    @After("execution(* com.faintdream.spring6.service..*(..))")
    public void afterAdvice(){
        log("最终通知");
    }

    @AfterThrowing("execution(* com.faintdream.spring6.service..*(..))")
    public void afterThrowingAdvice(){
        log("异常通知，发生异常时执行");
    }

    private void log(String log){
        System.err.println(log + "【" + getClass().getSimpleName() + "】");
    }
}
