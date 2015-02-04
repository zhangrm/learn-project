package com.zrm.pattern.factory.simple;

/**
 * Created by dfb365009 on 2015/1/16.
 */
public class Orange implements Fruit {
    @Override
    public String getName() {
        return "桔子";
    }

    @Override
    public String taste() {
        return "酸酸甜甜";
    }
}
