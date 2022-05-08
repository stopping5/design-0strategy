package com.stopping.design.concreate;

/**
 * @Classname: ClientMain
 * @Date: 2022/5/7 5:51 下午
 * @author: stopping
 */
public class ClientMain {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new SendCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
