package com.faintdream.spring6;

import com.faintdream.spring6.bean.IsSimpleValueType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Time;
import java.util.Date;

/**
 * 测试xx是否为简单类型
 * */
public class IsSimpleValueTypeTest {

    private final static Logger logger = LoggerFactory.getLogger(IsSimpleValueTypeTest.class);

    @Test
    public void dateTest(){

        // date
        logger.info(new Date().toString());

        // time
        long timeInMillis = System.currentTimeMillis();
        Time time = new Time(timeInMillis);
        logger.info(String.valueOf(timeInMillis));
        logger.info(time.toString());
    }

    @Test
    public void isSimpleValueTypeTest1(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean
        Class<?> beanType = applicationContext.getType("testType");
        IsSimpleValueType type = applicationContext.getBean("testType",IsSimpleValueType.class);

        logger.info(type.toString());

    }
}
