package com.stopping.design.responsibility.leave;

public class LeaveRequest {
    /**
     * 请假姓名
     */
    private String name;
    /**
     * 请假天数
     */
    private Integer day;

    public LeaveRequest(String name, Integer day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
