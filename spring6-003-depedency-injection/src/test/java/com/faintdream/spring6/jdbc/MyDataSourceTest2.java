package com.faintdream.spring6.jdbc;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDataSourceTest2 {

    private final static Logger logger = LoggerFactory.getLogger(MyDataSourceTest2.class);

    @Test
    public void DataSourceTest(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");

        // 构建javaBean
        Object ds1 = applicationContext.getBean("ds1", MyDataSource1.class);
        Object ds2 = applicationContext.getBean("ds2", MyDataSource2.class);

        // 测试
        logger.info(ds1.toString());
        logger.info(ds2.toString());
    }
}
