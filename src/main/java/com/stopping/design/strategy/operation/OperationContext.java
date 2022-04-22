package com.stopping.design.strategy.operation;

/**
 * 算法上下文
 * @Classname: OperationContext
 * @Date: 2022/4/22 11:46 上午
 * @author: stopping
 */
public class OperationContext {
    /**
     * 运算执行策略
     * */
    private OperationStrategy operationStrategy;

    public OperationContext(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    public Integer execute(Integer a,Integer b){
        return operationStrategy.execute(a,b);
    }
}
