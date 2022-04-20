package com.stopping.design.decorator;

public abstract class BattercakeDecotator extends Battercake{

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
