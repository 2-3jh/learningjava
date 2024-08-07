package com.feidian.sort;

import java.util.Arrays;

public class SelectDemo {
    public static void main(String[] args) {
        int []arr={2,4,5,3,1};
        arr=selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

    private static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
