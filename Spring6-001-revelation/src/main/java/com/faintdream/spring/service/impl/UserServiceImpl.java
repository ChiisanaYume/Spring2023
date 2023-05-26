package com.faintdream.spring.service.impl;

import com.faintdream.spring.dao.UserDao;
import com.faintdream.spring.dao.impl.UserDaoImplMySql;
import com.faintdream.spring.dao.impl.UserDaoImplOracle;
import com.faintdream.spring.service.UserService;

public class UserServiceImpl implements UserService {

    //private UserDao dao = new UserDaoImplMySql();
    private final UserDao dao = new UserDaoImplOracle();
    /**
     * 删除用户的业务方法
     */
    @Override
    public void deleteUser() {

        System.out.println("删除用户的业务");
        //调用持久化层
        dao.deleteById(888666);
    }
}
