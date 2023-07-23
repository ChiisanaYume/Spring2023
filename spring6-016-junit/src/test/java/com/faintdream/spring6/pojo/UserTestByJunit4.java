package com.faintdream.spring6.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTestByJunit4 {
    @Autowired
    private User user;

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user1 = applicationContext.getBean("user", User.class);
        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user1.getInfo());

    }

    @Test
    public void test2(){
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getInfo());
    }


}
