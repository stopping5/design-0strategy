package com.stopping.design.responsibility.userRegister;

public class UserRegisterMain {
    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO("stopping","13143359896",11);
        UserRegisterHandle userRegisterHandle = new PhoneHandle();
        userRegisterHandle.linkHandle(new MajorUserHandle()).linkHandle(new UserNameHandle());

        if (userRegisterHandle.check(userDTO)){
            System.out.println("检验成功");
        }else{
            System.out.println("检验失败");
        }

    }
}
