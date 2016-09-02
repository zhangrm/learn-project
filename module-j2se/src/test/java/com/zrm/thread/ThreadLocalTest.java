package com.zrm.thread;

import org.junit.Test;

/**
 * Created by zrm on 2016-08-04 18:15.
 */
public class ThreadLocalTest {

    /**
     * -verbose:gc
     */

    @Test
    public void testOOM(){

        ThreadLocal threadLocal = new ThreadLocal();

        for(int i=0;i<100;i++){
            threadLocal.set(new byte[1024*1024*50]);
        }



    }


}
