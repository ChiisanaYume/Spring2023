package com.faintdream.spring6.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author faintdream
 * @version 1.0
 * */
public class SpringFirstTest {
    @Test
    public void springCode1Test(){

        // 1.获取Spring容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        /*
         * ApplicationContext 应用上下文(Spring容器)
         * 是一个接口，有很多实现类
         * ClassPathXmlApplicationContext 是实现类之一
         * ClassPathXmlApplicationContext 从类路径spring配置文件加载
         * */


        // 2.根据bean的id从Spring容器中获取对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

        Object dao = applicationContext.getBean("dao.mysql");
        System.out.println(dao);
    }

    @Test
    public void springCode2Test(){

        // 1.获取Spring容器对象(多个)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml","bean.xml");

        // 2.根据bean的id从Spring容器中获取对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

        Object dao = applicationContext.getBean("dao.mysql");
        System.out.println(dao);

        Object vip = applicationContext.getBean("vip");
        System.out.println(vip);
    }

    /**
     * 获取java.util.Date对象
     * */
    @Test
    public void springCode3Test(){
        // 1.获取Spring容器对象(多个)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 2.根据bean的id从Spring容器中获取对象
        Object Date = applicationContext.getBean("date");
        System.out.println(Date);

    }

    /**
     * java对象在Spring容器构建的时候已经创建好了
     * */
    @Test
    public void springCode4Test(){

        // 1.获取Spring容器对象(多个)
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // User 的构造方法执行了
    }



    /**
     * 不从类路径加载Spring容器
     * */

    @Test
    @Ignore
    public void XmlPathTest(){
        // 不从类路径加载Spring容器，而是从绝对路径
        // 这种方法用的很少，了解就好。。。

        // 1.获取Spring容器对象(绝对路径)
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("C:\\Windows\\Temp\\spring.xml");

        // 2.根据bean的id从Spring容器中获取对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

        Object dao = applicationContext.getBean("dao.mysql");
        System.out.println(dao);

    }

    /**
     * Spring底层的IoC实际上是 XML解析 + 工厂模式 + 反射机制
     * ApplicationContext 接口的超级父接口 BeanFactory
     * */
    @Test
    public void factoryTest(){

        // 1.获取Spring容器对象(BeanFactory)
        BeanFactory applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 2.根据bean的id从Spring容器中获取对象
        Object User = applicationContext.getBean("user");
        System.out.println(User);

    }

    /**
     * 记录日志
     * */
    @Test
    public void beginInitBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

        // 使用log4j记录日志
        // 1.创建日志记录器对象
        Logger logger = LogManager.getLogger(SpringFirstTest.class);

        // 2.记录日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试");
        logger.error("我是一条错误");
    }

    @Test
    public void beginInitBean2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

        // 使用log4j记录日志
        // 1.创建日志记录器对象
        org.slf4j.Logger logger = LoggerFactory.getLogger(SpringFirstTest.class);

        // 2.记录日志
        logger.info("我是一条消息");
        logger.debug("我是一条调试");
        logger.error("我是一条错误");
    }
}
