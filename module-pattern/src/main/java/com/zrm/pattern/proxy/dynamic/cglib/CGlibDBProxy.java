package com.zrm.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zrm on 2016-03-09 16:57.
 */
public class CGlibDBProxy implements MethodInterceptor {

    private static CGlibDBProxy proxy = new CGlibDBProxy();

    private static class Holder{
        private static CGlibDBProxy DB_PROXY = new CGlibDBProxy();
    }

    public static CGlibDBProxy getInstance(){
        return Holder.DB_PROXY;
    }


    public <T> T getProxy(Class<T> clazz){
        return (T) Enhancer.create(clazz,this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();

        Object result = methodProxy.invokeSuper(o,objects);

        after();
        return null;
    }

    private void before() {
        System.out.println("connection.setAutoCommit(false);");
    }

    private void after() {
        System.out.println("connection.commit();");
    }
}
