package com.stopping.design.strategy.operation;

/**
 * @Classname: StrategyTest
 * @Date: 2022/4/22 11:24 上午
 * @author: stopping
 */
public class StrategyTest {
    public static void main(String[] args) {
        //OperationContext operationContext = new OperationContext(new MutStrategy());

        //OperationContextV1 operationContextV1 = new OperationContextV1();


        System.out.println(OperationContextEnum.ADD.execute(2,3));
    }
}
