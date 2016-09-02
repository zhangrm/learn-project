package com.zrm.jvm;

/**
 * Created by zrm on 2016-09-02 10:08.
 */
public class OnStackTest {
    public static void alloc(){
        byte[] b=new byte[2];
        b[0]=1;
    }
    public static void main(String[] args) {
        long b=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            alloc();
        }
        long e=System.currentTimeMillis();
        System.out.println(e-b);
    }
}
