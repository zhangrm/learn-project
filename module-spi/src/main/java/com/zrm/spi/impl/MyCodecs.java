package com.zrm.spi.impl;

import com.zrm.spi.CodecSet;

/**
 * Created by dfb365009 on 2015/1/14.
 */
public class MyCodecs implements CodecSet {

    @Override
    public String getEncoder(String encodingName) {
        return "MyCodecs - getEncoder";
    }

    @Override
    public String getDecoder(String encodingName) {
        return "MyCodecs - getDecoder";
    }

}
