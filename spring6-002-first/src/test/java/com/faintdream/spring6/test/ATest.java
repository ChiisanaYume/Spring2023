package com.faintdream.spring6.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author faintdream
 * @version 1.0
 * */
public class ATest {
    @Test
    public void A1Test(){

        // 1.获取Spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        /*
         * ApplicationContext 应用上下文(Spring容器)
         * 是一个接口，有很多实现类
         * ClassPathXmlApplicationContext 是实现类之一
         * ClassPathXmlApplicationContext 从类路径spring配置文件加载
         * */


        // 2.根据bean的id从Spring容器中获取这个对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

        Object dao = applicationContext.getBean("dao.mysql");
        System.out.println(dao);
    }

    @Test
    public void A2Test(){

        // 1.获取Spring容器对象(多个)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","bean.xml");

        // 2.根据bean的id从Spring容器中获取这个对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

        Object dao = applicationContext.getBean("dao.mysql");
        System.out.println(dao);

        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
    }
}
