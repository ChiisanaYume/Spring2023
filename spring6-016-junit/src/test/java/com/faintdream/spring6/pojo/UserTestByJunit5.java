package com.faintdream.spring6.pojo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
public class UserTestByJunit5 {
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
