package com.zrm.pattern.listener;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangrm on 2015/11/22.
 */
public abstract class ClickListener implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        onClick((Button)o);
    }

    public abstract void onClick(Button button);

}
