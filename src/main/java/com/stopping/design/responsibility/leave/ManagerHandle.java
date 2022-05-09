package com.stopping.design.responsibility.leave;

import java.util.Random;

/**
 * 主管角色
 * 拥有处理七天一下的请假
 */
public class ManagerHandle extends LeaveHandle{
    public ManagerHandle(String name) {
        super(name);
    }

    @Override
    boolean process(LeaveRequest leaveRequest) {
        boolean result = (new Random().nextInt(10)) > 3; // 随机数大于3则为批准，否则不批准
        String log = "经理<%s> 审批 <%s> 的请假申请，请假天数： <%d> ，审批结果：<%s> ";
        System.out.println(String.format(log, this.name, leaveRequest.getName(), leaveRequest.getDay(), result ? "批准" : "不批准"));
        if (!result){
            return false;
        }else if (leaveRequest.getDay() < 7){
            return true;
        }
        System.out.println("经理角色无法处理大于7天的假期，流程继续往下");
        return checkHandle(leaveRequest);
    }
}
