package com.faintdream.spring.bean2;

import org.springframework.stereotype.Repository;

/**
 * java bean
 * @author faintdream
 * @version 1.0
 * */
@Repository
public class Kirara {
    public Kirara() {
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
