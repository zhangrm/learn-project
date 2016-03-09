package com.zrm.pattern.proxy.dynamic;

/**
 * Created by zrm on 2016-03-09 16:29.
 */
public class Service implements IService {


    @Override
    public int saveToDB(String name) {
        System.out.println(name+ " saveToDB");
        return 1;
    }
}
