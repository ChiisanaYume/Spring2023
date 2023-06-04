package com.faintdream.simple.factory;

/**
 * 简单工厂模式 - 消费者
 * @author faintdream
 * @version 1.0
 * */
public class Main {
    public static void main(String[] args) {

        Weapon Tank = WeaponFactory.getWeapon("Tank");
        Tank.attack();

        Weapon Fighter = WeaponFactory.getWeapon("Fighter");
        Fighter.attack();

        Weapon Dagger = WeaponFactory.getWeapon("Dagger");
        Dagger.attack();

    }
}
