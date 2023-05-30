package com.faintdream.spring6.bean;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.util.Date;

/**
 * bean
 * 测试xx是否为简单类型
 */
public class IsSimpleValueType {

    private String name;
    private int age;
    private double money1;
    private BigDecimal money2;
    private boolean isNiko;

    private Date date;

    private Character character;

    private URI uri;
    private URL url;

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

    public double getMoney1() {
        return money1;
    }

    public void setMoney1(double money1) {
        this.money1 = money1;
    }

    public BigDecimal getMoney2() {
        return money2;
    }

    public void setMoney2(BigDecimal money2) {
        this.money2 = money2;
    }

    public boolean isNiko() {
        return isNiko;
    }

    public void setNiko(boolean niko) {
        isNiko = niko;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "IsSimpleValueType{" +
                "                            name='" + name + '\'' +
                ",\n                            age=" + age +
                ",\n                            money1=" + money1 +
                ",\n                            money2=" + money2 +
                ",\n                            isNiko=" + isNiko +
                ",\n                            date=" + date +
                ",\n                            character=" + character +
                ",\n                            uri=" + uri +
                ",\n                            url=" + url +
                '}';
    }
}
