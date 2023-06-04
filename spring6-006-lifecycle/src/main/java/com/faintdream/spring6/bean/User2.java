package com.faintdream.spring6.bean;
/**
 * 测试spring的生命周期
 * */
public class User2 {
    public User2() {
        System.out.println("第一步:" + this.getClass().getSimpleName() + "bean：实例化(调用无参数构造方法)");
    }

    public User2(String name) {
        this.name = name;
        System.out.println("第一步:" + this.getClass().getSimpleName() + "bean：实例化(调用有参数构造方法)");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("第二步:" + this.getClass().getSimpleName() + "bean：属性赋值(调用set方法)");
        this.name = name;
    }

    public void init(){
        System.out.println("第三步:" + this.getClass().getSimpleName() + "bean：初始化");
    }

    public void destroy(){
        System.out.println("第五步:" + this.getClass().getSimpleName() + "bean：销毁");
    }
}
