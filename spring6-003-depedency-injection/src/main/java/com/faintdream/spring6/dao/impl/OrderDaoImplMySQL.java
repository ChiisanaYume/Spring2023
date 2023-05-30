package com.faintdream.spring6.dao.impl;

import com.faintdream.spring6.dao.OrderDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderDaoImplMySQL implements OrderDao {

    private static final Logger logger = LoggerFactory.getLogger(OrderDaoImplMySQL.class);
    /**
     *
     */
    @Override
    public void insert() {
        logger.warn("用户点单中...");
    }
}
