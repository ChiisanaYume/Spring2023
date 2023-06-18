package com.faintdream.spring.bean4.service;

import com.faintdream.spring.bean4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    @Autowired
    @Qualifier("userDaoByOracle")
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void show(){
        dao.insert("Amber");
    }
}
