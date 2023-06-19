package com.faintdream.spring6.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class MyDataSourceTest {
    @Test
    public void DataSourceTest() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
        // System.out.println(com.mysql.cj.jdbc.Driver.class);
        System.out.println(myDataSource.getConnection());

        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate.getDataSource());

    }
}
