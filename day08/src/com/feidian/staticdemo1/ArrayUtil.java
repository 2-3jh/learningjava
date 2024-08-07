package com.feidian.staticdemo1;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){};
    public static String printArr(int [] arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]+",");
        }
        sb.append(arr[arr.length-1]+"]");
        return sb.toString();
    }
}
