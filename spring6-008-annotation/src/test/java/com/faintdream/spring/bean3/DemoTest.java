package com.faintdream.spring.bean3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void beanComponentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);

        System.out.println(myDataSource);

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

    }
}
