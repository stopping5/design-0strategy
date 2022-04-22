package com.stopping.design.strategy.operation;

/**
 * @Classname: StrategyTest
 * @Date: 2022/4/22 11:24 上午
 * @author: stopping
 */
public class StrategyTest {
    public static void main(String[] args) {
        OperationContext operationContext = new OperationContext(new MutStrategy());
        System.out.println(operationContext.execute(1,1));
    }
}
