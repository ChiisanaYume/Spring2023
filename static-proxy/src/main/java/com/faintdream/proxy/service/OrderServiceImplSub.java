package com.faintdream.proxy.service;

public class OrderServiceImplSub extends OrderServiceImpl{

    /**
     * 创建订单
     */
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");
    }

    /**
     * 修改订单
     */
    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");

    }

    /**
     * 查询订单详情
     */
    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end-begin) + "毫秒");
    }
}
