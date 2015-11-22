package com.zrm.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangrm on 2015/11/22.
 */
public class Dad implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        Child child = (Child)o;
        System.out.println(child.getName()+"'s Dad come here");
    }
}
