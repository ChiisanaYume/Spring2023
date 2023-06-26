package com.faintdream.proxy.client;

import com.faintdream.proxy.service.TimerMethodInterceptor;
import com.faintdream.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {
        // 创建字节码增强器对象
        // 这个对象是CGLIB库当中的核心对象，就是靠它来生成代理类
        Enhancer enhancer = new Enhancer();

        // 告诉CGLIB父类(目标类)是谁
        enhancer.setSuperclass(UserService.class);

        // 设置回调
        enhancer.setCallback(new TimerMethodInterceptor());

        // 创建代理对象
        UserService userServiceProxy = (UserService) enhancer.create();

        // 调用代理对象的代理方法
        boolean login = userServiceProxy.login("Amber", "SUKI");
        System.out.println(login?"登录成功":"登录失败");
        userServiceProxy.logout();

    }
}
