package com.faintdream.proxy.service;

public class UserServiceImpl implements UserService{
    /**
     * 登录账号
     *
     * @param username 用户名
     * @param password 用户密码
     * @return true表示登录成功
     */
    @Override
    public Boolean login(String username, String password) {
        System.out.println("验证登录" + getName());
        if("username".equals(username) && "password".equals(password)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 退出登录
     */
    @Override
    public void logout() {
        System.out.println("退出登录" + getName());
    }

    private String getName(){
        return getClass().getSimpleName();
    }
}
