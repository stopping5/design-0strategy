package com.stopping.design.decorator;
/**
 * 基础套餐
 * */
public class BaseBattercake extends Battercake{
    @Override
    public String getName() {
        return "手抓饼";
    }

    @Override
    public Integer getPrice() {
        return 5;
    }
}
