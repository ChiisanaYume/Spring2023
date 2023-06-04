package com.faintdream.spring6.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void lifecycleTest1() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);

        //使用对象
        System.out.println("第四步:" + user.getClass().getSimpleName() + "bean：使用bean(对象)");

        //手动关闭spring容器
        ClassPathXmlApplicationContext temp = (ClassPathXmlApplicationContext) applicationContext;

        temp.close();
    }
}
