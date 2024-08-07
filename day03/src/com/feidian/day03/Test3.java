package com.feidian.day03;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("情书入起始和结尾");
        int from = sc.nextInt();
        int to = sc.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] newArr = new int[to - from];
        newArr = copyOfRange(arr, from, to);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int []newArr=new int [to-from];
        for(int i=from,j=0;i<to;i++,j++){
            newArr[j]=arr[i];
        }
        return newArr;
    }
}
