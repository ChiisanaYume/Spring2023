package com.faintdream.spring6.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

public class Person3 {


    private Set<Student> studentSet;

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "studentSet=" + studentSet +
                '}';
    }
}
