package com.faintdream.spring.dao;

import com.faintdream.spring.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void beanComponentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");
        GenshinRole genshinRole = applicationContext.getBean("genshinRole", GenshinRole.class);
        System.out.println(genshinRole);

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }
}
