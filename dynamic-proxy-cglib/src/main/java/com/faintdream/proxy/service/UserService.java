package com.faintdream.proxy.service;

public interface UserService {
    /**
     * 登录账号
     * @param username 用户名
     * @param password 用户密码
     * @return true表示登录成功
     * */
    Boolean login(String username,String password);

    /**
     * 退出登录
     * */
    void logout();
}
