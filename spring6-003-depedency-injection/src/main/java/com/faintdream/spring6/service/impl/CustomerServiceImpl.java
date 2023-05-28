package com.faintdream.spring6.service.impl;

import com.faintdream.spring6.dao.UserDao;
import com.faintdream.spring6.dao.VipDao;
import com.faintdream.spring6.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private UserDao userDao;
    private VipDao vipDao;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    /**
     *
     */
    @Override
    public void save() {
        userDao.insert();
        vipDao.insert();
    }

}
