package com.stopping.design.strategy.pay;

public class Order {
    private String uid;

    private String oid;

    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public String pay(String payKey){
        return PayStrategy.get(payKey).pay(uid,amount);
    }
}
