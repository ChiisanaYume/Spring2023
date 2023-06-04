package com.faintdream.spring6.bean;

import java.util.Date;

/**
 * 测试P命名空间
 * @author faintdream
 * @version 1.0
 * */
public class Dog {

    // 简单类型
    private String name;
    private int age;

    // 非简单类型
    private Date birth; // Date是简单类型，这里作为引用类型测试

    // P命名空间注入底层还是set注入,只不过p命名空间注入可以让Spring配置变得更加简单。


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
