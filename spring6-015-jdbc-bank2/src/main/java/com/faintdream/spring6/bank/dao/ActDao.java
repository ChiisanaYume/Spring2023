package com.faintdream.spring6.bank.dao;

import com.faintdream.spring6.bank.pojo.Act;

import java.util.List;

/**
 * 持久化层 - 数据库的增删改查
 * @version 1.0
 * @author faintdream
 * */
public interface ActDao {
    /**
     * 查询一条数据
     * */
    Act selectByActNo(String actNo);

    /**
     * 查询所有数据
     * */
    List<Act> selectAll();

    /**
     * 修改一条数据
     * */
    int update(Act act);

    /**
     * 增加一条数据
     */
    int insert(Act act);

}
