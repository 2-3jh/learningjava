package com.feidian.runtime;

import java.io.IOException;

public class RuntimeDome {
    public static void main(String[] args) throws IOException {
        Runtime rt=Runtime.getRuntime();
        //rt.exit(0);
        System.out.println(rt.availableProcessors());

        System.out.println(rt.maxMemory()/1024/1024);

        System.out.println(rt.totalMemory()/1024/1024);

        System.out.println(rt.freeMemory()/1024/1024);

        Runtime.getRuntime().exec("shutdown -s -t 10");


    }
}
