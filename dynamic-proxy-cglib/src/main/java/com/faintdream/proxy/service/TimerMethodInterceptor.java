package com.faintdream.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimerMethodInterceptor implements MethodInterceptor {
    /**
     * @param target
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        // 前面增强
        long begin = System.currentTimeMillis();

        // 调用目标方法
        Object value = methodProxy.invokeSuper(target, objects);

        // 后面增强
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - begin) + "毫秒");
        return value;
    }
}
