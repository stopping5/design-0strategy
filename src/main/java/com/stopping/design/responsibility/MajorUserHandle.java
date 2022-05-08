package com.stopping.design.responsibility;

public class MajorUserHandle extends UserRegisterHandle{
    @Override
    boolean check(UserDTO userDTO) {
        System.out.println("检验是否成年");
        if (userDTO.getAge() < 18){
            return false;
        }
        return this.checkNext(userDTO);
    }
}
