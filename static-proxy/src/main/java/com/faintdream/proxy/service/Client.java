package com.faintdream.proxy.service;

/**
 * 模拟客户端请求
 * @author faintdream
 * @version 1.0
 * */
public class Client {
    public static void main(String[] args) {
        // test1();
        test2();
    }

    private static void test1(){
        OrderService os = new OrderServiceImpl();
        os.generate();
        os.modify();
        os.detail();
    }

    private static void test2(){
        OrderService os = new OrderServiceImplSub();
        os.generate();
        os.modify();
        os.detail();
    }
}
