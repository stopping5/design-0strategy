package com.stopping.design.strategy.operation;

/**
 * @Classname: MutStrategy
 * @Date: 2022/4/22 11:23 上午
 * @author: stopping
 */
public class MutStrategy implements OperationStrategy{
    @Override
    public Integer execute(Integer a, Integer b) {
        System.out.println("执行乘法策略");
        return a * b;
    }
}
