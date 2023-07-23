package com.faintdream.spring6.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class User {
    private String name;
    private String info;

    public User(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    @Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }
    @Value("${info}")
    public void setInfo(String info) {
        this.info = info;
    }
}
