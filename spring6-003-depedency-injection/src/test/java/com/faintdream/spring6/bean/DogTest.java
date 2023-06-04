package com.faintdream.spring6.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试P命名空间注入
 * @author faintdream
 * @version 1.0
 * */
public class DogTest {

    public final static Logger logger = LoggerFactory.getLogger(DogTest.class);

    @Test
    public void ApplicationContext1Test(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");

        // 构建javaBean
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);

        // 测试P命名空间注入
        logger.info(dogBean.toString());
    }
}
