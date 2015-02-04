package com.zrm.spi;

/**
 * Created by dfb365009 on 2015/1/14.
 */
public interface CodecSet {
    public String getEncoder(String encodingName);
    public String getDecoder(String encodingName);
}
