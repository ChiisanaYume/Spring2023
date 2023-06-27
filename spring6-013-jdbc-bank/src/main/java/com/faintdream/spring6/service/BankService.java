package com.faintdream.spring6.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface BankService {

    /**
     * 转账业务
     * @param fromActNo 转入账户
     * @param toActNo 转出账户
     * */
    void transfer(final String fromActNo,final String toActNo,final BigDecimal money)throws Exception;
}
