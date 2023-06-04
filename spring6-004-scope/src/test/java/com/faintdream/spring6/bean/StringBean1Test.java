package com.faintdream.spring6.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试scope与bean的作用域
 * @author faintdream
 * @version 1.0
 * */
public class StringBean1Test {

    @Test
    public void sbTest(){

        StringBean1 stringBean1 = new StringBean1();

        System.out.println(stringBean1);
    }

    /**
     * 1.Spring默认情况下是如何管理bean的
     * 默认情况下Bean是单例的(singleton)
     * 在Spring容器(applicationContext)初始化的时候实例化
     * 每一次调用getBean()方法，都返回这个单例的对象
     *
     * 2.当bean的scope属性设置为prototype(原型，多例)
     * bean是多例的
     * Spring容器初始化的时候，并不会初始化这些prototype的bean
     * 每一次调用getBean()方法，都实例化并返回(不同的)bean对象
     * */
    @Test
    public void scopeTest1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");

        StringBean1 sb1 = applicationContext.getBean("stringBean1", StringBean1.class);
        StringBean1 sb2 = applicationContext.getBean("stringBean1", StringBean1.class);
        StringBean1 sb3 = applicationContext.getBean("stringBean1", StringBean1.class);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
    }


}
