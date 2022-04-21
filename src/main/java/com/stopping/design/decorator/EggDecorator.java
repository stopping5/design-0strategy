package com.stopping.design.decorator;

/**
 * 鸡蛋装饰器
 * @author stopping 
 * */
public class EggDecorator extends BattercakeDecotator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    public String getName() {
        return super.getName() + "+ 一个鸡蛋";
    }

    @Override
    public Integer getPrice() {
        return super.getPrice() + 1;
    }
}
