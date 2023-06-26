package com.faintdream.spring6.service;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class UserServiceTest {
    @Test
    public void aTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
        userService.logout();
    }

    @Test
    public void bTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }

    @Test
    public void exceptionTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        try {
            userService.throwException();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(2);
        }
    }

    @Test
    public void noXmlTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService service = applicationContext.getBean("userService", UserService.class);
        service.logout();
    }

    @Ignore
    @Test
    public void recursionTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        LogAspectj logAspectj = applicationContext.getBean("logAspectj",LogAspectj.class);
        System.out.println(logAspectj);

        // 递归，爆栈(并不会,应该是没有递归问题)
        logAspectj.afterReturningAdvice();
        logAspectj.beforeAdvice();

        // logAspectj.log("NB");
    }
}
