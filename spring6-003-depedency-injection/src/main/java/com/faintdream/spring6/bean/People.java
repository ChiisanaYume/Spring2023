package com.faintdream.spring6.bean;

import java.util.Date;

/**
 * 测试c命名空间
 * @author faintdream
 * @version 1.0
 * */
public class People {

    private String name;
    private String sex;
    private Date birth;

    public People(String name, String sex, Date birth) {
        this.name = name;
        this.sex = sex;
        this.birth = birth;
    }

    public People(){

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
                '}';
    }
}
