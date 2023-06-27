package com.faintdream.spring6.dao.impl;

import com.faintdream.spring6.dao.ActDao;
import com.faintdream.spring6.pojo.Act;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
public class ActDaoImplTest {
    private ActDao dao = new ActDaoImpl();

    @Test
    public void selectAllTest(){
        List<Act> acts = dao.selectAll();
        System.out.println(acts);
    }

    @Test
    public void selectByActNoTest(){
        Act act002 = dao.selectByActNo("ACT002");
        System.out.println(act002);
    }

    @Test
    public void updateTest(){
        Act act002 = new Act("act002",new BigDecimal(251));
        int c = dao.update(act002);
        Assert.assertEquals(1,c);
    }
}
