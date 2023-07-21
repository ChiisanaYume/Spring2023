package com.faintdream.spring6.bank.service.impl;

import com.faintdream.spring6.bank.dao.ActDao;
import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.service.BankService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class BankServiceImpl2 implements BankService {

    private ActDao actDao;
    /**
     * 转账业务
     *
     * @param fromActNo 转入账户
     * @param toActNo   转出账户
     * @param money
     */
    @Override
    public void transfer(String fromActNo, String toActNo, BigDecimal money) throws Exception {
        System.out.println("未实现");
    }

    /**
     * 保存账户业务(测试事务)
     *
     * @param act 账户对象
     */
    @Override
    //@Transactional(propagation = Propagation.REQUIRED)
    public void save(Act act) {
        actDao.insert(act);
    }

    public ActDao getActDao() {
        return actDao;
    }

    @Resource(name="actDaoImpl")
    public void setActDao(ActDao actDao) {
        this.actDao = actDao;
    }
}
