package com.faintdream.spring6.bank.dao.impl;

import com.faintdream.spring6.bank.dao.ActDao;
import com.faintdream.spring6.bank.pojo.Act;
import jakarta.annotation.Resource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ActDaoImpl implements ActDao {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Act selectByActNo(String actNo) {
        String sql = "SELECT act_no,balance FROM t_act2 WHERE act_no = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Act.class), actNo);

    }

    @Override
    public List<Act> selectAll() {
        String sql = "SELECT act_no,balance FROM t_act2";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Act.class));
    }

    @Override
    public int update(Act act) {
        String sql = "UPDATE t_act2 SET balance=? WHERE act_no = ?";
        return jdbcTemplate.update(sql,act.getBalance(),act.getActNo());
    }

    /**
     * 增加一条数据
     *
     * @param act
     */
    @Override
    public int insert(Act act) {
        String sql = "INSERT INTO t_act2(act_no,balance) VALUE(?,?)";
        return jdbcTemplate.update(sql,act.getActNo(),act.getBalance());
    }


    public ActDaoImpl() {

    }

    @Resource(name="jdbcTemplate")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
