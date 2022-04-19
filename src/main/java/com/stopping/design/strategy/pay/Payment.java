package com.stopping.design.strategy.pay;

public abstract class Payment {

    public abstract String getName();

    public abstract double queryBalance(String uid);

    public String pay(String uid,double amount){
        if (queryBalance(uid) < amount){
            return "支付失败，余额不足";
        }
        return "支付成功" + getName() + "，支付金额" + amount;
    }

}
