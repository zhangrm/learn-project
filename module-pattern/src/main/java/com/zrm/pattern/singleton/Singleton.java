package com.zrm.pattern.singleton;

/**
 * Created by dfb365009 on 2015/1/15.
 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
 * http://www.cnblogs.com/java-my-life/archive/2012/03/22/2412308.html
 */
public final class Singleton {

     /*private static volatile Singleton singleton = new Singleton();

     public static Singleton getInstance(){
        return  singleton;
     }*/


    private static class SingletonHolder{
        public static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.SINGLETON;
    }

}
