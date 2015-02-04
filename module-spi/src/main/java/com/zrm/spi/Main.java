package com.zrm.spi;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        ServiceLoader<CodecSet> codecSetLoader = ServiceLoader.load(CodecSet.class);
        for (CodecSet codecSet : codecSetLoader) {
            System.out.println(codecSet.getDecoder(""));
        }

    }
}
