package com.faintdream.spring6.service.impl;

import com.faintdream.spring6.service.BankService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class BankServiceTest {

    @Test
    public void transferTest() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        BankService bankService = applicationContext.getBean("bankServiceImpl", BankServiceImpl.class);

        bankService.transfer("ACT001","ACT002",new BigDecimal(1000));
    }
}
