package com.zrm.pattern.observer;

import java.util.Observable;

/**
 * Created by zhangrm on 2015/11/22.
 */
public class Child extends Observable{

    private String name;

    public Child(String name){
        this.name = name;
    }

    /**
     * 小孩醒来了
     */
    public void wakeUp(){
        System.out.println(name+" wake up!!!");
        setChanged();//小孩状态发生变化
        notifyObservers("wake up");//醒来事件通知
    }

    public String getName() {
        return name;
    }
}
