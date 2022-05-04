package com.stopping.design.strategy.operation;

/**
 * @Classname: OperationContextEnum
 * @Date: 2022/4/22 4:07 下午
 * @author: stopping
 */
public enum OperationContextEnum {
    /**
     * 加法策略
     * */
    ADD("加法策略",0){
        @Override
        Integer execute(Integer a, Integer b) {
            return a+b;
        }
    },
    /**
     * 乘法策略
     * */
    MUT("乘法策略",1){
        @Override
        Integer execute(Integer a, Integer b) {
            return a*b;
        }
    },
    ;
    /**
     * 策略名称
     * */
    private String name;

    /**
     * 策略类型
     * */
    private Integer type;


    abstract Integer execute(Integer a, Integer b);

    OperationContextEnum(String name, Integer type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Integer getType() {
        return type;
    }


}
