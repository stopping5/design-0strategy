package com.stopping.design.strategy.pay;

public class AliPayStrategy extends Payment{
    @Override
    public String getName() {
        return "支付宝支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 100;
    }
}
