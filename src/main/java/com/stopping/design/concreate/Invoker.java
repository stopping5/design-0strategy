package com.stopping.design.concreate;

/**
 * @Classname: Invoker
 * @Description: 执行者
 * @Date: 2022/5/7 4:56 下午
 * @author: stopping
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
