package com.faintdream.spring6.service.impl;

import com.faintdream.spring6.dao.ActDao;
import com.faintdream.spring6.pojo.Act;
import com.faintdream.spring6.service.BankService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;

//@Service
public class BankServiceImpl implements BankService {

    //@Resource(name = "actDaoImpl")
    private ActDao actDao;

    /**
     * 转账业务
     * 控制事务(这个方法需要控制事务)
     *
     * @param fromActNo 转入账户
     * @param toActNo   转出账户
     */
    @Override
    public void transfer(String fromActNo, String toActNo, BigDecimal money) throws Exception{
        // 查询转出账户余额
        Act fromAct = actDao.selectByActNo(fromActNo);

        // 如果转账金额大于转出账户余额，不能转账
        if (money.compareTo(fromAct.getBalance()) < 0) {
            throw new IOException("余额不足，不能转账");
        }

        // 查询转入账户余额
        Act toAct = actDao.selectByActNo(toActNo);

        // 修改转出账户和转入账户余额
        fromAct.setBalance(fromAct.getBalance().subtract(money));
        toAct.setBalance(toAct.getBalance().add(money));

        // 提交数据库
        actDao.update(fromAct);
        actDao.update(toAct);
    }

    public ActDao getActDao() {
        return actDao;
    }

    public void setActDao(ActDao actDao) {
        this.actDao = actDao;
    }
}
