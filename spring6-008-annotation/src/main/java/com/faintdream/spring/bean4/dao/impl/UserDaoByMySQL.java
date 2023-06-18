package com.faintdream.spring.bean4.dao.impl;

import com.faintdream.spring.bean4.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoByMySQL implements UserDao {
    /**
     * @param User
     */
    @Override
    public void insert(String User) {
        System.out.println("模拟插入一条用户信息【MySQL】");
    }
}
