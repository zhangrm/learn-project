package com.zrm.pattern.proxy.dynamic.cglib;

import com.zrm.pattern.proxy.dynamic.IService;
import com.zrm.pattern.proxy.dynamic.Service;
/**
 * Created by zrm on 2016-03-09 16:32.
 */
public class Test {



    public static void main(String args[]){

        IService service = CGlibDBProxy.getInstance().getProxy(Service.class);
        service.saveToDB("zrm");

    }
}
