package com.stopping.design.strategy.operation;

/**
 * 加法算法策略
 * @Classname: AddStrategy
 * @Date: 2022/4/22 11:22 上午
 * @author: stopping
 */
public class AddStrategy implements OperationStrategy{
    @Override
    public Integer execute(Integer a, Integer b) {
        return a+b;
    }
}
