package com.stopping.design.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public final static String WXPAY = "wxpay";

    public final static String ALI = "alipay";

    public final static String DEFAULT = "alipay";

    private static Map<String,Payment> strategy = new HashMap<>();
    static {
        strategy.put(WXPAY,new WeChatPayStrategy());
        strategy.put(ALI,new AliPayStrategy());
    }

    public static Payment get(String payKey){
        if (!strategy.containsKey(payKey)){
            return strategy.get(DEFAULT);
        }
        return strategy.get(payKey);
    }
}
