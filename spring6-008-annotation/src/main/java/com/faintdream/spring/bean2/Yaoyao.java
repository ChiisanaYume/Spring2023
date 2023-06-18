package com.faintdream.spring.bean2;

import org.springframework.stereotype.Service;

/**
 * java bean
 * @author faintdream
 * @version 1.0
 *
 * */
@Service
public class Yaoyao {
    public Yaoyao() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
