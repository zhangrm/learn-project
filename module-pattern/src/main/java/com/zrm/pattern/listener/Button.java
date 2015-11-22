package com.zrm.pattern.listener;

import java.util.Observable;

/**
 * Created by zhangrm on 2015/11/22.
 */
public class Button extends Observable {


    public void setOnCLickListener(ClickListener listener){
        this.addObserver(listener);
    }

    /**
     * 被点击
     */
    public void click(){
        System.out.println("触发点击事件");
        setChanged();
        notifyObservers();
    }



}
