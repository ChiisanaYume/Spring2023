package com.faintdream.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * java bean
 * @className User2
 * @author faintdream
 * @version 1.0
 *
 * */
@Repository
public class GenshinRole {
    public GenshinRole(){
        System.out.println(this.getClass()+"无参构造执行了");
    }
}
