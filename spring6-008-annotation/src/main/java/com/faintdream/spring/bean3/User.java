package com.faintdream.spring.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class User {
    @Value("Nahida")
    private String name;
    @Value("500")
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
