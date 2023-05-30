package com.faintdream.spring6.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


public class Person2 {



    private List<String> names;

    private List<Student> students;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Autowired
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "names=" + names +
                ", students=" + students +
                '}';
    }
}
