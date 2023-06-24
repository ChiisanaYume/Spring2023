package com.faintdream.proxy.util;

import com.faintdream.proxy.service.OrderService;
import com.faintdream.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    private ProxyUtil() {
    }

    public Object newProxyInstance(Object target) {
        TimerInvocationHandler timerInvocationHandler = new TimerInvocationHandler((OrderService) target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                new Class[]{OrderService.class},
                timerInvocationHandler);
    }

}
