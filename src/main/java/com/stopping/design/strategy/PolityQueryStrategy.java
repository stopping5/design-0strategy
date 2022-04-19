package com.stopping.design.strategy;

public class PolityQueryStrategy implements QuertStartegy<String>{
    @Override
    public String query(Integer integer) {
        return "polity strategy";
    }
}
