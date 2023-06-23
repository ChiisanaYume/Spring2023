package com.faintdream.proxy.service;

/**
 * 场景，项目运作1年多，项目经理想要统计每一项业务的执行耗时
 * 解决方法1:硬编码，直接再原来的代码上添加新的功能
 *
 * 这种方案的缺点:
 * **** 违背OCP开闭原则
 * **** 代码没有得到复用
 *
 * 解决方案二：编写一个字类继承这个类，添加新功能
 * **** 代码没有得到复用
 * **** 解决了OCP开闭原则，但是耦合度较高(继承 是一种耦合度较高的关系)
 *
 * 解决方案三：静态代理
 * */
public class OrderServiceImpl implements  OrderService{
    /**
     * 创建订单
     */
    @Override
    public void generate() {
        simulate();
        System.out.println("订单已生成");
    }

    /**
     * 修改订单
     */
    @Override
    public void modify() {
        simulate();
        System.out.println("订单已修改");
    }

    /**
     * 查询订单详情
     */
    @Override
    public void detail() {
        simulate();
        System.out.println("请看订单详情");
    }

    /**
     * 模拟正常的业务
     * */
    private void simulate(){
        try {
            Thread.sleep(2345);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
