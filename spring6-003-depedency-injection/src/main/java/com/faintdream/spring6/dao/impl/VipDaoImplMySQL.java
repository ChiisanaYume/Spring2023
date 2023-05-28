package com.faintdream.spring6.dao.impl;

import com.faintdream.spring6.dao.UserDao;
import com.faintdream.spring6.dao.VipDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VipDaoImplMySQL implements VipDao {
    final Logger logger = LoggerFactory.getLogger(VipDao.class);
    /**
     *
     */
    @Override
    public void insert() {
        logger.info("调用MySQL执行插入一条VIP用户数据");
    }
}
