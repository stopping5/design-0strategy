package com.stopping.design.strategy.pay;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order("1","2022019201",300);
        System.out.println(order.pay(PayStrategy.ALI));
    }
}
