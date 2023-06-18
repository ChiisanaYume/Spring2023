package com.faintdream.spring.bean2;

import org.springframework.stereotype.Component;

/**
 * java bean
 * @author faintdream
 * @version 1.0
 *
 * */
@Component
public class Nahida {
    public Nahida() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
