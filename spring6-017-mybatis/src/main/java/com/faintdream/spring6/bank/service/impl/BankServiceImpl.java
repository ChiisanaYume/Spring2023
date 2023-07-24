package com.faintdream.spring6.bank.service.impl;

import com.faintdream.spring6.bank.mapper.ActMapper;
import com.faintdream.spring6.bank.pojo.Act;
import com.faintdream.spring6.bank.service.BankService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;

@Service
public class BankServiceImpl implements BankService {

    private ActMapper actMapper;

    /**
     * 转账业务
     * 控制事务(这个方法需要控制事务)
     *
     * @param fromActNo 转入账户
     * @param toActNo   转出账户
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer(String fromActNo, String toActNo, BigDecimal money) throws Exception{
        // 查询转出账户余额
        Act fromAct = actMapper.selectByActNo(fromActNo);

        // 如果转账金额大于转出账户余额，不能转账
        if (money.compareTo(fromAct.getBalance()) > 0) {
            throw new IOException("余额不足，不能转账");
        }

        // 查询转入账户余额
        Act toAct = actMapper.selectByActNo(toActNo);

        // 修改转出账户和转入账户余额
        fromAct.setBalance(fromAct.getBalance().subtract(money));
        toAct.setBalance(toAct.getBalance().add(money));

        // 提交数据库
        actMapper.update(fromAct);

        // int a = 5/0; // 模拟异常

        actMapper.update(toAct);
    }

    @Resource(name = "actMapper")
    public void setActMapper(ActMapper actMapper) {
        this.actMapper = actMapper;
    }

}
