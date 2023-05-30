package com.faintdream.spring6.service.impl;

import com.faintdream.spring6.dao.OrderDao;
import com.faintdream.spring6.service.OrderService;

public class OrderServiceImpl implements OrderService {

    OrderDao dao;
    /**
     *
     */
    @Override
    public void order() {
        dao.insert();
    }

    public OrderDao getDao() {
        return dao;
    }

    public void setDao(OrderDao dao) {
        this.dao = dao;
    }
}
