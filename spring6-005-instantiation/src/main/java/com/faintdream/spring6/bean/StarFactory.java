package com.faintdream.spring6.bean;

/**
 * 简单工厂 - 具体工厂
 * @version 1.0
 * @author faintdream
 * */
public class StarFactory {

    public static Star get(){
        return new Star();
    }
}
