package com.zrm.pattern.factory.simple;

/**
 * Created by dfb365009 on 2015/1/16.
 */
public class Factory {

    public static final String APPLE = "APPLE";
    public static final String ORANGE = "ORANGE";

    public Fruit getProduct(String name){
        if(APPLE.equals(name)){
            return new Apple();
        }else if(ORANGE.equals(name)){
            return new Orange();
        }else{
            throw new RuntimeException("没有找到类型");
        }
    }

}
