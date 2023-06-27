package com.faintdream.spring6.dao.impl;

import com.faintdream.spring6.dao.ActDao;
import com.faintdream.spring6.pojo.Act;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActDaoImpl implements ActDao {

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    private JdbcTemplate template = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);

    @Override
    public Act selectByActNo(String actNo) {
        String sql = "SELECT act_no,balance FROM t_act2 WHERE act_no = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<>(Act.class), actNo);

    }

    @Override
    public List<Act> selectAll() {
        String sql = "SELECT act_no,balance FROM t_act2";
        return template.query(sql, new BeanPropertyRowMapper<>(Act.class));
    }

    @Override
    public int update(Act act) {
        String sql = "UPDATE t_act2 SET balance=? WHERE act_no = ?";
        return template.update(sql,act.getBalance(),act.getActNo());
    }

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
}
