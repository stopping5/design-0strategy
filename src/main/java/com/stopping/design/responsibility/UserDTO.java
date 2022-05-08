package com.stopping.design.responsibility;

/**
 * 用户注册信息
 * */
public class UserDTO {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 年龄
     */
    private Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserDTO(String userName, String phone, Integer age) {
        this.userName = userName;
        this.phone = phone;
        this.age = age;
    }
}
