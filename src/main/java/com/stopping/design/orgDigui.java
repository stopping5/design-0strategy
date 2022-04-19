package com.stopping.design;

public class orgDigui<T> {
    public T digui(Integer integer,IQueryDigui<T> iQueryDigui){
        System.out.println("ssss");
        return iQueryDigui.query(integer);
    }
}
