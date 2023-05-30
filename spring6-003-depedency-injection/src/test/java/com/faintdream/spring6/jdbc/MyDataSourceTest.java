package com.faintdream.spring6.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDataSourceTest {

    @Test
    public void myDataSourceTest(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean
        MyDataSource myDataSource = applicationContext.getBean("myDataSource",MyDataSource.class);

        // 测试
        System.out.println(myDataSource);
    }
}
