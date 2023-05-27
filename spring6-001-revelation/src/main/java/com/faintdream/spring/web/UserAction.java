package com.faintdream.spring.web;

import com.faintdream.spring.service.impl.UserServiceImpl;

/**
 * 表示层(view)
 * */
public class UserAction {

    /**
     * 删除用户的请求
     * */
    public void deleteUserRequest(){
        //删除用户请求
        new UserServiceImpl().deleteUser();
    }
}
