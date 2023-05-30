package com.faintdream.spring6;

import com.faintdream.spring6.bean.Clazz;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CascadeTest {

    /**
     *
     * 级联注入
     */

    @Test
    public void cascadeTest(){

        // 创建Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");

        // 构建javaBean
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);

        // 测试
        System.out.println(clazzBean);

    }
}
