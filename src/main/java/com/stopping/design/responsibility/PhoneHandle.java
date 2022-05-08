package com.stopping.design.responsibility;

public class PhoneHandle extends UserRegisterHandle{
    @Override
    boolean check(UserDTO userDTO) {
        System.out.println("校验手机号...");
        if ("".equals(userDTO.getPhone())){
            System.out.println("手机号不能为空");
            return false;
        }
        return this.checkNext(userDTO);
    }
}
