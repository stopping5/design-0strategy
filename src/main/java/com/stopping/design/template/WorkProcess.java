package com.stopping.design.template;

/**
 * 通过模板模式描述一个职员工作大致流程
 * @Classname: WorkProcess
 * @Date: 2022/4/26 5:00 下午
 * @author: stopping
 */
public abstract class WorkProcess {
    public final void work(){
        System.out.println("=============================");
        //起床
        this.up();
        //交通
        this.traffic();
        //工作
        this.working();
        //下班
        this.offWork();
        //运动，ifSport为钩子方法，外部重写钩子方法可以动态的实现算法
        this.sport(ifSport());
        //睡觉
        this.sleep();
    }

    //每个上班族交通方式不同，由子类实现
    abstract void traffic();

    //钩子方法，默认为false
    protected boolean ifSport() {
        return false;
    }

    //以下通用方法则不能在修改细节,通过final修饰
    //是否运动
    final void sport(boolean ifSport) {
        if (ifSport){
            System.out.println("喜欢运动，坚持运动");
        }else{
            System.out.println("累了，选择躺平");
        }

    }
    final void sleep() {
        System.out.println("开始睡觉...");
    }
    final void offWork() {
        System.out.println("跑路，下班");
    }

    final void working() {
        System.out.println("正在工作...");
    }

    final void up() {
        System.out.println("早上起床");
    }
}