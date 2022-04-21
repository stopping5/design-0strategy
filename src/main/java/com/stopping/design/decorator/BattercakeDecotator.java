package com.stopping.design.decorator;

/**
 * 手抓饼装饰器接口
 * @author stopping
 * */
public abstract class BattercakeDecotator extends Battercake{

    /**
     * 需要被装饰的手抓饼对象
     * 这里有点类似静态代理，但是用途跟静态代理的区别在于静态代理是对功能的增强，而装饰器是保持原有对象的使用
     * */
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    public String getName() {
        return this.battercake.getName();
    }

    @Override
    public Integer getPrice() {
        return this.battercake.getPrice();
    }
}
