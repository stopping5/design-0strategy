package com.stopping.design.template;

/**
 * @Classname: BoosProcess
 * @Date: 2022/4/26 5:09 下午
 * @author: stopping
 */
public class BoosProcess extends WorkProcess{
    private Boolean ifSport;

    public BoosProcess(Boolean ifSport) {
        this.ifSport = ifSport;
    }

    @Override
    protected boolean ifSport() {
        return ifSport;
    }

    @Override
    void traffic() {
        System.out.println("boss开车上班");
    }
}
