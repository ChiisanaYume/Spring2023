package com.faintdream.spring6.bean;

import java.util.Date;

public class Student {
    private String name;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Student() {
        System.out.println(this.getClass().getSimpleName() + "构造方法执行了");
    }

    public Student(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
