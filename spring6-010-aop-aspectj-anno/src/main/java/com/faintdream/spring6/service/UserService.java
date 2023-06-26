package com.faintdream.spring6.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author faintdream
 * @version 1.0
 */
@Service
public class UserService {
    public UserService() {
    }

    public void login() {
        System.out.println("正在验证用户登录【" + getClass().getSimpleName() + "】");
    }

    public void logout() {
        System.out.println("正在退出登录【" + getClass().getSimpleName() + "】");
    }

    public void throwException() throws IOException {
        throw new IOException("发生异常了");
    }
}
