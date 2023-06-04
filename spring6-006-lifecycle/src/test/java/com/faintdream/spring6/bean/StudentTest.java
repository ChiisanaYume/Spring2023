package com.faintdream.spring6.bean;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;


// 将自己new的对象纳入spring容器来管理。半路交给spring容器来管理

public class StudentTest {

    @Test
    public void testRegisterBean(){

        // 自己new的对象
        Student student = new Student();

        // 将自己new的对象纳入spring容器来管理。半路交给spring容器来管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean",student);

        // 从spring容器中获取
        Student student1 = factory.getBean("studentBean",Student.class);
        System.out.println(student1);


    }
}
