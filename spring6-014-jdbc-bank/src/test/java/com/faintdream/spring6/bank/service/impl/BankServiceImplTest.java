package com.faintdream.spring6.bank.service.impl;

import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.service.BankService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class BankServiceImplTest {
    @Test
    public void transfer() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankService bankService = applicationContext.getBean("bankServiceImpl", BankService.class);
        bankService.transfer("ACT003","ACT002",new BigDecimal(1000));
    }

    @Test
    public void saveTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankService bankService = applicationContext.getBean("bankServiceImpl", BankService.class);
        bankService.save(new Act("act010",new BigDecimal(10000)));
    }
}
