package com.faintdream.spring6.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IndexServiceTest {
    @Test
    public void xmlTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IndexService service = applicationContext.getBean("indexService", IndexService.class);
        service.show();
    }
}
