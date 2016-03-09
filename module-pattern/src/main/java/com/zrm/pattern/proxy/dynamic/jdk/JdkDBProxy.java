package com.zrm.pattern.proxy.dynamic.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zrm on 2016-03-09 16:21.
 */
public class JdkDBProxy implements InvocationHandler {

    private Object target;

    public JdkDBProxy(Object target){
        this.target = target;
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object result = method.invoke(target,args);

        after();
        return result;
    }

    private void before() {
        System.out.println("connection.setAutoCommit(false);");
    }

    private void after() {
        System.out.println("connection.commit();");
    }




    public <T> T getProxy() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
