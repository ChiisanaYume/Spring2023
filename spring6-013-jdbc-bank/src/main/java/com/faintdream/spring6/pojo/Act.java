package com.faintdream.spring6.pojo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * pojo类
 * @author faintdream
 * @version 1.0
 * */

@Repository
public class Act {
    private String actNo;
    private BigDecimal balance;

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Act(String actNo, BigDecimal balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public Act() {
    }

    @Override
    public String toString() {
        return "Act{" +
                "actNo='" + actNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
