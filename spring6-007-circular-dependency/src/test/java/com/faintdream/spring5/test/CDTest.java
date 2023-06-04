package com.faintdream.spring5.test;

import com.faintdream.spring6.bean.Husband;
import com.faintdream.spring6.bean.Wife;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDTest {

    @Test
    public void cdTest1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Husband husband1 = applicationContext.getBean("husband1", Husband.class);
        Wife wife1 = applicationContext.getBean("wife1",Wife.class);

        System.out.println(husband1);
        System.out.println(wife1);
    }

    @Test
    public void cdTest2(){

        Husband husband = new Husband();
        Wife wife = new Wife();

        husband.setName("王宝强");
        wife.setName("马蓉");
        husband.setWife(wife);
        wife.setHusband(husband);

        System.out.println(husband);
        System.out.println(wife);

    }

    @Ignore
    @Test
    public void cdTest3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Husband husband2 = applicationContext.getBean("husband2", Husband.class);
        Wife wife2 = applicationContext.getBean("wife2",Wife.class);

        System.out.println(husband2);
        System.out.println(wife2);
    }

    @Ignore
    @Test
    public void cdTest4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Husband husband3 = applicationContext.getBean("husband3", Husband.class);
        Wife wife3 = applicationContext.getBean("wife3",Wife.class);

        System.out.println(husband3);
        System.out.println(wife3);
    }

    @Ignore
    @Test
    public void cdTest5(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Husband husband4 = applicationContext.getBean("husband4", Husband.class);
        Wife wife4 = applicationContext.getBean("wife4",Wife.class);

        System.out.println(husband4);
        System.out.println(wife4);
    }

    @Ignore
    @Test
    public void cdTest6(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Wife wife5 = applicationContext.getBean("wife5",Wife.class);
        Husband husband5 = applicationContext.getBean("husband5", Husband.class);

        System.out.println(husband5);
        System.out.println(wife5);
    }
}
