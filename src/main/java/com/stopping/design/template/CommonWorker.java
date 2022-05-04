package com.stopping.design.template;
/**
 * 普通工人
 * 实现交通方式方法
 * */
public class CommonWorker extends WorkProcess{
    private boolean ifSport;

    public CommonWorker(boolean ifSport) {
        this.ifSport = ifSport;
    }

    @Override
    protected boolean ifSport() {
        return ifSport;
    }

    @Override
    void traffic() {
        System.out.println("打工人只能做公交");
    }
}
