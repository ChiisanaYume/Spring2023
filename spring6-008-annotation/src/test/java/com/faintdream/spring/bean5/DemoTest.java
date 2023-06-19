package com.faintdream.spring.bean5;

import com.faintdream.spring.bean5.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

    @Test
    public void beanComponentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring3.xml");
        StudentService service = applicationContext.getBean("studentService", StudentService.class);
        service.deleteStudent();
    }

    @Test
    public void noXMLTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        System.out.println(applicationContext);
        StudentService service = applicationContext.getBean("studentService", StudentService.class);
        service.deleteStudent();
    }
}
