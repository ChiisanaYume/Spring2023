package com.faintdream.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimerInvocationHandler implements InvocationHandler {

    // 目标对象
    OrderService target;
    public TimerInvocationHandler(OrderService target) {
        // 赋值目标对象
        this.target = target;
    }

    /**
     * invoke方法是JDK负责调用的,JDK调用这个方法的时候会传入三个参数
     * @param proxy     代理对象的引用
     * @param method    目标对象的目标方法
     * @param args      目标方法的实参
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // System.out.println("增强1");

        long begin = System.currentTimeMillis();
        // 调用目标对象的目标方法
        Object invokeReturn = method.invoke(target, args);

        // System.out.println("增强2");
        long end = System.currentTimeMillis();

        System.out.println("耗时:" + (end-begin) + "毫秒");

        return invokeReturn;
        // 注意invoke方法的返回值,如果代理方法对象调用代理方法之后，需要返回结果的话；
        // invoke方法必须将目标对象的目标方法执行结果继续返回...
    }
}
