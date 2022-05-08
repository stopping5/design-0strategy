package com.stopping.design.responsibility;

/**
 * 用户注册检验控制器
 */
public abstract class UserRegisterHandle {

    private UserRegisterHandle nextHandle;

    /**
     * 设置下一个参数校验器
     * @param userRegisterHandle
     * @return
     */
    public UserRegisterHandle linkHandle(UserRegisterHandle userRegisterHandle) {
        this.nextHandle = userRegisterHandle;
        return userRegisterHandle;
    }

    /**
     * 参数校验方法
     * @param userDTO
     * @return
     */
    abstract boolean check(UserDTO userDTO);

    /**
     * 责任链传递
     * @param userDTO
     * @return
     */
    protected boolean checkNext(UserDTO userDTO){
        if (nextHandle == null){
            return false;
        }
        return nextHandle.check(userDTO);
    }
}
