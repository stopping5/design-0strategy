package com.stopping.design.concreate;

/**
 * @Classname: DeleteCommand
 * @Date: 2022/5/7 5:15 下午
 * @author: stopping
 */
public class DeleteCommand implements Command{
    private Receiver receiver;

    public DeleteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.send();
    }
}
