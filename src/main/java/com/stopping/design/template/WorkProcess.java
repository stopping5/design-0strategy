package com.stopping.design.template;

/**
 * 通过模板模式描述一个职员工作大致流程
 * @Classname: WorkProcess
 * @Date: 2022/4/26 5:00 下午
 * @author: stopping
 */
public abstract class WorkProcess {
    public final void work(){
        this.up();

        this.traffic();

        this.working();

        this.offWork();

        this.sport(ifSport());

        this.sleep();
    }

    private void sleep() {
        System.out.println("开始睡觉...");
    }

    abstract void sport(boolean ifSport) ;

    protected boolean ifSport() {
        return false;
    }

    private void offWork() {
        System.out.println("跑路，下班");
    }

    private void working() {
        System.out.println("正在工作...");
    }

    private void traffic() {
        System.out.println("做交通工具去上班路上");
    }

    private void up() {
        System.out.println("早上起床");
    }
}
