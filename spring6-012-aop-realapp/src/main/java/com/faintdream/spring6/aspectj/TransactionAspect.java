package com.faintdream.spring6.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

    // @Around 环绕通知 后面跟切点表达式
    @Around("execution(* com.faintdream.spring6.service..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint){

        try {
            // 前面的代码
            log("开启事务");

            // 获取目标方法的参数
            Object[] args = joinPoint.getArgs();

            // 执行目标(spring会处理空指针异常)
            joinPoint.proceed(args);

            // 后面的代码
            log("提交事务");
        } catch (Throwable e) {
            e.printStackTrace();
            log("发生异常，回滚事务");
        }

    }

    private void log(String log){
        System.out.printf("%s【%s】\n",log,this.getClass().getSimpleName());
    }
}
