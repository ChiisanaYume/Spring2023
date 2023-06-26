package com.faintdream.spring6.aspectj;

import com.faintdream.spring6.service.util.MyLog;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class LogAspectj implements Advice {

    // 环绕通知
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前面的代码
        MyLog.log("前环绕通知",this);

        // 获取目标方法的参数
        Object[] args = joinPoint.getArgs();
        // 执行目标(spring会处理空指针异常)
        joinPoint.proceed(args);

        // 后面的代码
        MyLog.log(joinPoint.getKind(),this);
        MyLog.log("后环绕通知",this);
    }

    // 前置通知
    public void beforeAdvice(){
        MyLog.log("前置通知",this);
    }
}
