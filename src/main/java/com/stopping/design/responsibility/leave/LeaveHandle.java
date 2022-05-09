package com.stopping.design.responsibility.leave;

/**
 * 请假流程抽象实体
 */
public abstract class LeaveHandle {
    /**
     * 下个处理器
     */
    private LeaveHandle nextHandle;
    /**
     * 主管名称
     */
    protected String name;

    public LeaveHandle(String name) {
        this.name = name;
    }

    public LeaveHandle setNextHandle(LeaveHandle nextHandle) {
        this.nextHandle = nextHandle;
        return nextHandle;
    }

    public boolean checkHandle(LeaveRequest leaveHandle){
        if (leaveHandle == null){
            return false;
        }
        return nextHandle.process(leaveHandle);
    }

    /**
     * 抽象流程 由具体的流程实现
     * @param leaveRequest
     * @return
     */
    abstract boolean process(LeaveRequest leaveRequest);
}
