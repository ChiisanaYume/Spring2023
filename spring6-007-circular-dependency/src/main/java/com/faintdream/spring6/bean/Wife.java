package com.faintdream.spring6.bean;

public class Wife {
    private Husband husband;
    private String name;

    public Wife(Husband husband, String name) {
        this.husband = husband;
        this.name = name;
    }

    public Wife() {
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "Husband='" + husband.getName() + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
