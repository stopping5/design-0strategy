package com.stopping.design.strategy.operation;

/**
 * 算法策略
 * @Classname: OperationStrategy
 * @Date: 2022/4/22 11:21 上午
 * @author: stopping
 */
public interface OperationStrategy {
    /**
     * 执行方法
     * @param a
     * @param b
     * @return 执行结果
     * */
    Integer execute(Integer a,Integer b);
}
