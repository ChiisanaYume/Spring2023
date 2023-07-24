package com.faintdream.spring6.bank.mapper;

import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ActMapperTest {

    @Autowired
    private ActMapper actMapper;


    private void show(List<Act> actList){
        for(Act act: actList){
            System.err.println(String.format("账户%s:余额%s",act.getActNo(),act.getBalance()));
        }
    }

    private void show(Act act){
        List<Act> actList = new LinkedList<>();
        actList.add(act);
        show(actList);
    }

    /**
     * 不使用spring框架
     * */
    @Ignore
    @Test
    public void selectAllTest1() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        ActMapper mapper = sqlSession.getMapper(ActMapper.class);
        List<Act> acts = mapper.selectAll();
        show(acts);
        sqlSession.close();
    }

    @Test
    public void selectAllTest2(){
        System.err.println(actMapper);
        List<Act> acts = actMapper.selectAll();
        show(acts);
    }

    @Test
    public void selectByActNoTest(){
        System.err.println(actMapper);
        Act act006 = actMapper.selectByActNo("act006");
        show(act006);
    }

    @Test
    public void updateTest(){
        System.err.println(actMapper);
        int i = actMapper.update(new Act("act007", new BigDecimal(200000)));
        Assert.assertEquals(i,1);

        Act act007 = actMapper.selectByActNo("act007");
        show(act007);


    }
}

//org.apache.ibatis.binding.MapperProxy@1706a5c9
//org.apache.ibatis.binding.MapperProxy@1706a5c9
//org.apache.ibatis.binding.MapperProxy@1706a5c9
// 同一对象-单例模式
