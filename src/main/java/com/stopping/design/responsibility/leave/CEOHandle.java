package com.stopping.design.responsibility.leave;

import java.util.Random;

/**
 * CEO角色
 * 最高权限
 */
public class CEOHandle extends LeaveHandle{

    public CEOHandle(String name) {
        super(name);
    }

    @Override
    boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3; // 随机数大于3则为批准，否则不批准
        String log = "CEO<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getDay(), result ? "批准" : "不批准"));
        return result;

    }
}
