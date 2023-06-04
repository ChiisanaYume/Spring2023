package com.faintdream.simple.factory;

/**
 * 简单工厂模式 - 具体产品
 * @author faintdream
 * @version 1.0
 * */
public class Fighter extends Weapon{
    /**
     * 武器进行攻击的方法
     */
    @Override
    public void attack() {
        System.out.println("飞机扔下小男孩");
    }
}
