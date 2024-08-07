package com.feidian.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[]arr=new int[10];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(0,10);
        }
        //toString数组转换为字符串
        String str=Arrays.toString(arr);
        System.out.println(str);
        //binarySearch
        System.out.println(Arrays.binarySearch(arr, 8));
        //copyOf
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 11)));
        //copyOfRange
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1, 9)));
        //fill填充数组
        //Arrays.fill(arr,666);
        //System.out.println(Arrays.toString(arr));
        //sort 默认升序/底层用快速排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //sort逆序排列
        Integer []arr1={6,56,15,15,6,5,156,1,56,5};
        Arrays.sort(arr1,(o1,o2)->
            o2-o1);
        System.out.println(Arrays.toString(arr1));
    }
}
