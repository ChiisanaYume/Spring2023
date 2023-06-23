package com.faintdream.proxy.service;

/**
 * 公共接口
 * */
public interface OrderService {

    /**
     * 创建订单
     * */
    void generate();

    /**
     * 修改订单
     */
    void modify();

    /**
     * 查询订单详情
     */
    void detail();
}
