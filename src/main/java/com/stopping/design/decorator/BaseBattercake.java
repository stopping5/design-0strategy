package com.stopping.design.decorator;

public class BaseBattercake extends Battercake{
    @Override
    public String getName() {
        return "煎饼";
    }

    @Override
    public Integer getPrice() {
        return 5;
    }
}
