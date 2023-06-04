package com.faintdream.factory;

/**
 * 消费者
 * @author faintdream
 * @version 1.0
 * */
public class Main {
    public static void main(String[] args) {

        WeaponFactory daggerFactory = new DaggerFactory();
        WeaponFactory gunFactory = new GunFactory();

        Weapon dagger = daggerFactory.getWeapon();
        Weapon gun = gunFactory.getWeapon();

        dagger.attack();
        gun.attack();
    }
}
