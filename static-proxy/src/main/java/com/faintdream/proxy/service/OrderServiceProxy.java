package com.faintdream.proxy.service;

/**
 * 代理对象
 * @author faintdream
 * @version 1.0
 * */
// 代理对象和目标对象要具有相同的行为，需要实现相同的接口
// 客户端使用代理对象就和使用目标对象一样
public class OrderServiceProxy implements OrderService{

    // 将目标对象作为代理对象的一个属性。这种关系叫做关连关系，
    // 比起泛化(继承)关系，管理关系的耦合度更低
    private final OrderService orderService;

    // 创建代理对象的时候，传一个目标对象给代理对象
    public OrderServiceProxy(OrderService orderService){
        this.orderService = orderService;
    }

    /**
     * 创建订单
     */
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");
    }

    /**
     * 修改订单
     */
    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");
    }

    /**
     * 查询订单详情
     */
    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");
    }
}
