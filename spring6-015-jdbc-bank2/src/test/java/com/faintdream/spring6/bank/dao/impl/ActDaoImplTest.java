package com.faintdream.spring6.bank.dao.impl;

import com.faintdream.spring6.bank.Spring6Config;
import com.faintdream.spring6.bank.dao.ActDao;
import com.faintdream.spring6.bank.pojo.Act;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ActDaoImplTest {

    @Test
    public void selectAllTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        ActDao dao = applicationContext.getBean("actDaoImpl", ActDaoImpl.class);
        List<Act> acts = dao.selectAll();
        System.out.println(acts);
    }

    @Test
    public void selectByActNoTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        ActDao dao = applicationContext.getBean("actDaoImpl",ActDaoImpl.class);
        Act act002 = dao.selectByActNo("ACT002");
        System.out.println(act002);
    }

    @Test
    public void updateTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        ActDao dao = applicationContext.getBean("actDaoImpl",ActDaoImpl.class);
        Act act002 = new Act("act002",new BigDecimal(2590));
        int c = dao.update(act002);
        Assert.assertEquals(c,1);
    }

    @Ignore
    @Test
    public void insertTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        ActDao dao = applicationContext.getBean("actDaoImpl",ActDaoImpl.class);
        Act act004 = new Act("act004",new BigDecimal(4444));
        int c = dao.insert(act004);
        Assert.assertEquals(c,1);
    }
    @Test
    public void ActDaoTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        System.out.println(applicationContext);
        //JdbcTemplate template = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
        //System.out.println(template);
        // ActDaoImpl actDao = new ActDaoImpl();
        // System.out.println(actDao);
        // Act act002 = actDao.selectByActNo("ACT002");
        // System.out.println(act002);
    }
}
