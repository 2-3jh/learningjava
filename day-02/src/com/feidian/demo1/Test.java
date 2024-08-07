package com.feidian.demo1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(1,100);
            sum += arr[i];
        }
        System.out.println(sum);
        double mean = sum / 10000000.0;
        System.out.println(mean);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mean)
                count++;
        }
        System.out.println(count);
    }
}
