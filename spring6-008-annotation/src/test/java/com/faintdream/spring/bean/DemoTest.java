package com.faintdream.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void beanComponentTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);

        People people = applicationContext.getBean("people", People.class);
        System.out.println(people);

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
