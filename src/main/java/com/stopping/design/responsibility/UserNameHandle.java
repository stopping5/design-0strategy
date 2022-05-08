package com.stopping.design.responsibility;

public class UserNameHandle extends UserRegisterHandle{
    @Override
    boolean check(UserDTO userDTO) {
        System.out.println("检验用户名是否有效");
        if (!"".equals(userDTO.getUserName())){
            return true;
        }
        return this.checkNext(userDTO);
    }
}
