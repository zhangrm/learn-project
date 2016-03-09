package com.zrm.pattern.proxy.dynamic.jdk;

import com.zrm.pattern.proxy.dynamic.IService;
import com.zrm.pattern.proxy.dynamic.Service;

/**
 * Created by zrm on 2016-03-09 16:32.
 */
public class DynamicProxyTest {



    public static void main(String args[]){

        JdkDBProxy dbProxy = new JdkDBProxy(new Service());
        IService service = dbProxy.getProxy();
        service.saveToDB("zrm");

    }
}
