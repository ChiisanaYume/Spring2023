package com.faintdream.spring6.bank.service.impl;

import com.faintdream.spring6.bank.mapper.ActMapper;
import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.service.BankService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class BankServiceImplTest {


    @Test
    public void transferTest() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        BankService bankService = applicationContext.getBean("bankServiceImpl", BankService.class);
        bankService.transfer("act003", "act002", new BigDecimal(1000));
    }

    @Resource(name = "bankServiceImpl")
    private BankService bankService;

    @Resource(name = "actMapper")
    private ActMapper actMapper;

    @Test
    public void transferTest2() throws Exception {
        Act act003 = actMapper.selectByActNo("act003");
        Act act002 = actMapper.selectByActNo("act002");
        System.err.println(act003);
        System.err.println(act002);

        bankService.transfer("act003", "act002", new BigDecimal(1000));

        act003 = actMapper.selectByActNo("act003");
        act002 = actMapper.selectByActNo("act002");
        System.err.println(act003);
        System.err.println(act002);
    }

}
//Act{actNo='act003', balance=3330333.00}
//Act{actNo='act002', balance=5590.00}

//Act{actNo='act003', balance=3329333.00}
//Act{actNo='act002', balance=6590.00}