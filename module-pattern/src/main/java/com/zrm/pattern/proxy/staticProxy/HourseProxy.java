package com.zrm.pattern.proxy.staticProxy;

/**
 * Created by zrm on 2015/1/16.
 */
public class HourseProxy implements Subject {

    private HouseOwner owner;

    public HourseProxy(HouseOwner owner){
       this.owner = owner;
    }

    @Override
    public void sell() {
        System.out.println("联系房东，确认房源");
        System.out.println("发布房源");
        System.out.println("带买主看房");
        System.out.println("和买主签订合同");
        owner.sell();
        System.out.println("和房主结算收益");

    }
}
