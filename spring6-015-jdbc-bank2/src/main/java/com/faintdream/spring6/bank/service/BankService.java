package com.faintdream.spring6.bank.service;

import com.faintdream.spring6.bank.pojo.Act;

import java.math.BigDecimal;

public interface BankService {

    /**
     * 转账业务
     * @param fromActNo 转入账户
     * @param toActNo 转出账户
     * */
    void transfer(final String fromActNo,final String toActNo,final BigDecimal money)throws Exception;

    /**
     * 保存账户业务(测试事务)
     * @param act 账户对象
     */
    void save(Act act);
}
