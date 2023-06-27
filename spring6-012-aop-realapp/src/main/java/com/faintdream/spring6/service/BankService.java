package com.faintdream.spring6.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    public void transfer() throws Exception {
        System.out.println("转账");
        throw new Exception("转账过程中发生异常");
    }
}
