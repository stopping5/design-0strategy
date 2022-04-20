package com.stopping.design.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        battercake =  new EggDecorator(battercake);
        battercake = new BeefDecorator(battercake);
        System.out.println(battercake.getName()+"价格:"+battercake.getPrice());
    }
}
