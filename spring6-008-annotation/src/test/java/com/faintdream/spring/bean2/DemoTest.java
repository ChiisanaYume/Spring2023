package com.faintdream.spring.bean2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void beanComponentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");

    }
}
