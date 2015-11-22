package com.zrm.pattern.observer;

/**
 * Created by zhangrm on 2015/11/22.
 */
public class Test {

    public static void main(String[] args){
        Child child = new Child("Tom");

        Mum mum = new Mum();
        Dad dad = new Dad();

        child.addObserver(mum);
        child.addObserver(dad);

        child.wakeUp();

    }

}
