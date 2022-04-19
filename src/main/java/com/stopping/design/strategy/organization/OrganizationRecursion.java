package com.stopping.design.strategy.organization;

public class OrganizationRecursion<T> {
    private QuertStartegy<T> quertStartegy;

    public OrganizationRecursion(QuertStartegy<T> quertStartegy){
        this.quertStartegy = quertStartegy;
    }

    public T execute(Integer integer){
        System.out.println("BEFORE");
        return quertStartegy.query(integer);
    }
}
