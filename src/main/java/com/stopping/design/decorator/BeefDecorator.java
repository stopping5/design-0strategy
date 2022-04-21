package com.stopping.design.decorator;

/**
 * 牛肉饼装饰器
 * @author stopping
 * */
public class BeefDecorator extends BattercakeDecotator{

    public BeefDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getName() {
        return super.getName() + "+ 牛肉饼";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 10;
    }
}
