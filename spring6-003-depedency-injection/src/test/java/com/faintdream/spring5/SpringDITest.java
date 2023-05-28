package com.faintdream.spring5;

import com.faintdream.spring6.service.impl.CustomerServiceImpl;
import com.faintdream.spring6.service.impl.UserServiceImpl;
import com.faintdream.spring6.service.impl.VipServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {

    /**
     * set注入
     * */
    @Test
    public void setDI001Test(){

        // 创建(获取)Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // 通过Spring容器构建Bean
        UserServiceImpl userServiceImpl = applicationContext.getBean("userServiceImpl", UserServiceImpl.class);

        // 执行测试
        userServiceImpl.saveUser();

        // 通过Spring容器构建Bean
        VipServiceImpl vipServiceImpl = applicationContext.getBean("vipServiceImpl", VipServiceImpl.class);

        // 执行测试
        vipServiceImpl.saveVip();

    }

    /**
     * 构造注入
     * */
    @Test
    public void setDI002Test(){

        // 创建(获取)Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");

        // 通过Spring容器构建Bean
        CustomerServiceImpl customerService1 = applicationContext.getBean("customerService01",CustomerServiceImpl.class);

        // 执行测试
        customerService1.save();


        // 通过Spring容器构建Bean
        CustomerServiceImpl customerService2 = applicationContext.getBean("customerService02",CustomerServiceImpl.class);

        // 执行测试
        customerService2.save();

        // 通过Spring容器构建Bean
        CustomerServiceImpl customerService3 = applicationContext.getBean("customerService02",CustomerServiceImpl.class);

        // 执行测试
        customerService3.save();

    }
}
