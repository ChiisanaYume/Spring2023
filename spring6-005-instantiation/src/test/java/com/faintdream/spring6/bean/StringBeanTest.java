package com.faintdream.spring6.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 * @author faintdream
 * @version 1.0
 * */
public class StringBeanTest {

    @Test
    public void beanInstantiationTest1(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 构建java bean(实际上java bean在spring容器加载的时候已经实例化了)
        StringBean sb = applicationContext.getBean("sb", StringBean.class);

        // 测试
        System.out.println(sb);

    }

    @Test
    public void beanInstantiationTest2(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 构建java bean(实际上java bean在spring容器加载的时候已经实例化了)
        Star star = applicationContext.getBean("star", Star.class);

        // 测试
        System.out.println(star);
    }

    @Test
    public void beanInstantiationTest3(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 构建java bean(实际上java bean在spring容器加载的时候已经实例化了)
        Lolita lolita = applicationContext.getBean("lolita", Lolita.class);

        // 测试
        System.out.println(lolita);
    }

    @Test
    public void beanInstantiationTest4(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 构建java bean(实际上java bean在spring容器加载的时候已经实例化了)
        Person person = applicationContext.getBean("person", Person.class);

        // 测试
        System.out.println(person);
    }

    @Test
    public void beanInstantiationTest5(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 构建java bean(实际上java bean在spring容器加载的时候已经实例化了)
        Student Amber = applicationContext.getBean("student", Student.class);

        // 测试
        System.out.println(Amber);
    }
}


