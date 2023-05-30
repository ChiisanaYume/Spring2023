package com.faintdream.spring6;

import com.faintdream.spring6.bean.*;
import com.faintdream.spring6.service.OrderService;
import com.faintdream.spring6.service.impl.CustomerServiceImpl;
import com.faintdream.spring6.service.impl.UserServiceImpl;
import com.faintdream.spring6.service.impl.VipServiceImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Set;
@Component
public class SpringDITest {

    // 日志对象
    private final static Logger logger = LoggerFactory.getLogger(SpringDITest.class);

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
    public void ConstructorDI001Test(){

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

    /**
     * 内部bean和外部bean
     * */
    @Test
    public void setDI002Test(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean(外部bean)
        OrderService orderService1 = applicationContext.getBean("orderServiceImpl1",OrderService.class);

        // 测试
        orderService1.order();

        // 构建Bean(内部bean)
        OrderService orderService2 = applicationContext.getBean("orderServiceImpl2",OrderService.class);

        // 测试
        orderService2.order();
    }

    /**
     * 测试注入简单数据类型
     *
     * */
    @Test
    public void setDI003Test(){

        // 获取Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean
        User user = applicationContext.getBean("user",User.class);

        // 测试
        logger.info(user.toString());

    }

    /**
     * 测试注入数组
     */
    @Test
    public void setDI_ArrayTest(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean
        Person person = applicationContext.getBean("person", Person.class);

        // 测试
        logger.info(person.toString());
    }

    /**
     * 测试注入List和set集合
     * */
    @Test
    public void setDI_CollectionTest(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建Bean
        Person2 person2 = applicationContext.getBean("person2", Person2.class);

        // 测试
        logger.info(person2.toString());
    }


    /**
     * 测试注入List和set集合
     * */
    @Test
    public void setDI_CollectionTest2(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建bean
        Person3 person3 = applicationContext.getBean("person3", Person3.class);

        // 测试
        logger.info(person3.toString());
        // logger.info(person31.toString());
    }

    /**
     * 测试注入List和set集合
     * */
    @Autowired
    @Qualifier("person3")
    Person3 person3_1;

    @Ignore
    @Test
    public void setDI_CollectionTest3(){
        logger.info(person3_1.toString());
    }

    /**
     * 测试Map集合
     * */
    @Test
    public void setDI_MapTest1(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建bean
        F4Map f4 = applicationContext.getBean("f4", F4Map.class);

        // 测试(简单类型)
        logger.info(f4.getF().toString());

        // 测试(引用类型)
        logger.info(f4.getStudentMap().toString());
    }

    /**
     * 测试注入Properties属性类对象
     * 这里的注入方法实际是构造注入
     * */
    @Test
    public void setDI_MapTest2(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建bean
        MyProperties myProperties = applicationContext.getBean("myProperties", MyProperties.class);

        // 测试
        logger.info(myProperties.toString());
    }


    /**
     * 赋null,空字符串
     * */
    @Ignore
    @Test
    public void setDI003(){
        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        // 构建bean
        String s1 = applicationContext.getBean("s1", String.class);
        String s2 = applicationContext.getBean("s2", String.class);
        String s3 = applicationContext.getBean("s3", String.class);
        // 测试
        logger.info(s1);
        logger.info(s2);
        logger.info(s3);
    }
}



