package com.stopping.design.concreate;

/**
 * @Classname: UpdateCommand
 * @Description: TODO
 * @Date: 2022/5/7 5:14 下午
 * @author: stopping
 */
public class UpdateCommand implements Command{
    private Receiver receiver;

    public UpdateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.update();
    }
}
