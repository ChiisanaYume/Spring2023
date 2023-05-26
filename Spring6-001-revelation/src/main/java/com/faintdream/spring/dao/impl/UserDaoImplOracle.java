package com.faintdream.spring.dao.impl;

import com.faintdream.spring.dao.UserDao;

public class UserDaoImplOracle implements UserDao {
    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        System.out.println("调用Oracle数据库删除用户信息成功");
    }
}
