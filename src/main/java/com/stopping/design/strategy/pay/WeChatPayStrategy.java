package com.stopping.design.strategy.pay;

public class WeChatPayStrategy extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 200;
    }
}
