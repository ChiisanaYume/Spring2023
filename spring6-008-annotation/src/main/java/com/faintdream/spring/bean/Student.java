package com.faintdream.spring.bean;

import org.springframework.stereotype.Service;

/**
 * java bean
 * @className User2
 * @author faintdream
 * @version 1.0
 *
 * */
@Service("student")
public class Student {
    public Student() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
