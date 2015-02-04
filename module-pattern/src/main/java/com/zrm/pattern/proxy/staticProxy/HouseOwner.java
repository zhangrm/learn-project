package com.zrm.pattern.proxy.staticProxy;

/**
 * Created by dfb365009 on 2015/1/16.
 */
public class HouseOwner implements Subject {



    @Override
    public void sell() {
         System.out.println("出售房屋");
    }
}
