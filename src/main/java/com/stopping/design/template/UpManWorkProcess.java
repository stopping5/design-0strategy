package com.stopping.design.template;

/**
 * @Classname: UpManWorkProcess
 * @Date: 2022/4/26 5:09 下午
 * @author: stopping
 */
public class UpManWorkProcess extends WorkProcess{
    private Boolean ifSport;

    public UpManWorkProcess(Boolean ifSport) {
        this.ifSport = ifSport;
    }

    @Override
    protected boolean ifSport() {
        return ifSport;
    }

    @Override
    void sport(boolean ifSport) {
        if (ifSport){
            System.out.println("热爱运动，从我做起");
        }else{
            System.out.println("累了，休息");
        }
    }
}
