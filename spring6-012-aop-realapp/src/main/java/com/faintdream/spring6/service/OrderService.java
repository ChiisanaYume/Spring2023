package com.faintdream.spring6.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void generate(){
        System.out.println("生成订单");
    }

    public void cancel(){
        System.out.println("取消订单");
    }

}
