package com.stopping.design.responsibility.leave;

public class LeaveClient {
    public static void main(String[] args) {
        LeaveHandle directorHandle = new DirectorHandle("zhang san");
        LeaveHandle managerHandle = new ManagerHandle("zhang si");
        LeaveHandle ceoHandle = new CEOHandle("zhang Boss");

        directorHandle.setNextHandle(managerHandle).setNextHandle(ceoHandle);

        LeaveRequest leaveRequest = new LeaveRequest("小米",11);
        if (directorHandle.process(leaveRequest)){
            System.out.println("请假批准");
        }else{
            System.out.println("拒绝请假");
        }
    }


}
