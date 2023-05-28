package com.faintdream.spring6.service.impl;

import com.faintdream.spring6.dao.VipDao;
import com.faintdream.spring6.service.VipService;

public class VipServiceImpl implements VipService {

    private VipDao vipDao;
    /**
     *
     */
    @Override
    public void saveVip() {
        vipDao.insert();
    }

    public VipDao getVipDao() {
        return vipDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }
}
