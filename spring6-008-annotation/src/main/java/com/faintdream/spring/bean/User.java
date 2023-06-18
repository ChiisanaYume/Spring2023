package com.faintdream.spring.bean;

import org.springframework.stereotype.Component;

/**
 * java bean
 * @className User
 * @author faintdream
 * @version 1.0
 *
 * */
@Component("user")
public class User {
    public User() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
