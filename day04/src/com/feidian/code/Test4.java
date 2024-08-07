package com.feidian.code;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int max = 0, min = 0;
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(101);
            System.out.println(arr[i]);
            if (arr[max] < arr[i]) {
                max = i;
            }
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(i!=max&&i!=min){
                sum+=arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum/4.0);
    }
}
