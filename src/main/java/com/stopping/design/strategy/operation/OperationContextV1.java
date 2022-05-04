package com.stopping.design.strategy.operation;

import java.util.HashMap;

/**
 * 策略调用上下文V1版本
 * @Classname: OperationContextV1
 * @Date: 2022/4/22 3:39 下午
 * @author: stopping
 */
public class OperationContextV1 {

    public static HashMap<String,OperationStrategy> operationStrategyMap = new HashMap<>();

    public static final String ADD_STRATEGY = "add";

    public static final String MUT_STRATEGY = "mut";

    static {
        operationStrategyMap.put(ADD_STRATEGY,new AddStrategy());
        operationStrategyMap.put(MUT_STRATEGY,new MutStrategy());
    }

    public Integer execute(String key,Integer a,Integer b){
        if (!operationStrategyMap.containsKey(key)){
            throw new RuntimeException("无法匹配策略");
        }
        return operationStrategyMap.get(key).execute(a,b);
    }

}
