package com.faintdream.spring6.bean;

import java.util.Arrays;

public class Person {

    private String[] names;
    private Student[] students;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public Person() {
    }
}
