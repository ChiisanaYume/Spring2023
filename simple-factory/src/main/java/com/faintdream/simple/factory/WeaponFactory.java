package com.faintdream.simple.factory;

/**
 * 简单工厂模式 - 工厂类
 * @author faintdream
 * @version 1.0
 * */
public class WeaponFactory {

    public static Weapon getWeapon(String weaponName){

        switch(weaponName){
            case "Tank":
                return new Tank();
            case "Fighter":
                return new Fighter();
            case "Dagger":
                return new Dagger();
        }

        return null;
    }
}
