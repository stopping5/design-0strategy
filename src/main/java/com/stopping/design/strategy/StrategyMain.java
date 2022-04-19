package com.stopping.design.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        OrganizationRecursion organizationRecursion = new OrganizationRecursion<String>(new PolityQueryStrategy());
        System.out.println(organizationRecursion.execute(1));
    }
}
