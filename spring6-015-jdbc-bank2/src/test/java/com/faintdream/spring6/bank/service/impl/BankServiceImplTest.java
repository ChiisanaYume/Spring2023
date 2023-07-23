package com.faintdream.spring6.bank.service.impl;

import com.faintdream.spring6.bank.Spring6Config;
import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.service.BankService;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class BankServiceImplTest {
    @Test
    public void transfer() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        BankService bankService = applicationContext.getBean("bankServiceImpl", BankService.class);
        bankService.transfer("ACT003","ACT002",new BigDecimal(1000));
    }

    @Ignore
    @Test
    public void saveTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        BankService bankService = applicationContext.getBean("bankServiceImpl", BankService.class);
        bankService.save(new Act("act010",new BigDecimal(10000)));
    }
}
