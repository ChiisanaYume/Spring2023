package com.faintdream.spring.client;

import com.faintdream.spring.web.UserAction;

/**
 * 测试程序
 *
 * @author faintdream
 * @version 1.0
 * */
public class Main {
    public static void main(String[] args) {
        UserAction userAction = new UserAction();
        userAction.deleteUserRequest();
    }
}
