package com.faintdream.spring.dao.impl;

import com.faintdream.spring.dao.UserDao;

public class UserDaoImplMySql implements UserDao {
    /**
     * 根据id删除用户信息
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        // 仅仅是demo
        System.out.println("调用MySQL数据库删除用户信息成功");
    }
}
