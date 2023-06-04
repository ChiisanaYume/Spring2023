package com.faintdream.spring6.bean;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试c命名空间
 * @version 1.0
 * @author faintdream
 * */
public class PeopleTest {


    private final static Logger logger = LoggerFactory.getLogger(PeopleTest.class);
    @Test
    public void CTest(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");

        // 构建javaBean
        People people1 = applicationContext.getBean("people1", People.class);
        People people2 = applicationContext.getBean("people2", People.class);

        // 测试
        logger.info(people1.toString());
        logger.info(people2.toString());

    }
}
