package com.faintdream.spring6.bank.service.exception;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException() {
        super("余额不足异常");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
