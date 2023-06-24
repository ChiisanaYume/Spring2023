package com.faintdream.proxy.client;

import com.faintdream.proxy.service.OrderService;
import com.faintdream.proxy.service.OrderServiceImpl;
import com.faintdream.proxy.service.TimerInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Locale;

/**
 * 模拟客户端
 * @author faintdream
 * @version 1.0
 * */
public class Client {
    public static void main(String[] args) {

        // 创建目标对象
        OrderService target = new OrderServiceImpl();

        // 创建代理对象
        InvocationHandler timerInvocationHandler = new TimerInvocationHandler(target);

        // newProxyInstance()的三个参数
        // 第一个参数:ClassLoader loader  类加载器
        //      在内存中生成的字节码也是class文件,要执行也得先加载到内存中,加载类就需要指定类加载器
        //      并且JDK要求,目标类的类加载器必须和代理类的类加载器是同一个
        // Class<?>[] interfaces
        //      代理类和目标类要实现同一个或者同一些接口
        //      在内存中生成代理类的时候，这个代理类需要告诉它实现了那些接口
        // InvocationHandler h
        //      调用处理器,是一个接口
        //      在调用处理器接口中编写的就是增强代码
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader(), new Class[]{OrderService.class}, timerInvocationHandler);

        // 调用代理对象的对象方法
        orderServiceProxy.generate();
        orderServiceProxy.modify();
        orderServiceProxy.detail();
        String s = orderServiceProxy.getName();
        System.out.println(s);

    }
}
