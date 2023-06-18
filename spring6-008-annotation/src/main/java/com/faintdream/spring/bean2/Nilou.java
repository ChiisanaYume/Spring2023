package com.faintdream.spring.bean2;

import org.springframework.stereotype.Controller;

/**
 * java bean
 * @author faintdream
 * @version 1.0
 *
 * */
@Controller
public class Nilou {
    public Nilou() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
