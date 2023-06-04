package com.faintdream.factory;
/**
 * 具体产品
 * @version 1.0
 * @author faintdream
 * */
public class Gun extends Weapon{
    /**
     * 武器进行攻击的方法
     */
    @Override
    public void attack() {
        System.out.println("突突突...");
    }
}
