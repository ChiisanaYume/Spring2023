package com.faintdream.spring6.bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VipTest {

    @Test
    public void lifecycleTest(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

        Vip user = applicationContext.getBean("vip", Vip.class);

        System.out.println("使用Bean");

        applicationContext.close();

    }
}
