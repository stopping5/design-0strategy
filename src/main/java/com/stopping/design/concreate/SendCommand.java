package com.stopping.design.concreate;

/**
 * @Classname: SendCommand
 * @Description: TODO
 * @Date: 2022/5/7 5:00 下午
 * @author: stopping
 */
public class SendCommand implements Command
{
    private Receiver receiver;

    public SendCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.send();
    }
}
