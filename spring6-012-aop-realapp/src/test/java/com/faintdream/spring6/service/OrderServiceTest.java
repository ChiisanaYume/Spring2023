package com.faintdream.spring6.service;

import com.faintdream.spring6.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceTest {
    @Test
    public void transactionAspectTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
    }

    @Test
    public void ExceptionTest() throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BankService bankService = applicationContext.getBean("bankService",BankService.class);
        bankService.transfer();
    }
}
