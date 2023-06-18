package com.faintdream.spring.bean4;

import com.faintdream.spring.bean4.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void beanComponentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.show();

    }
}
