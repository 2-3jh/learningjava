package com.feidian.sort;

public class BubbleDemo1 {
    public static void main(String[] args) {
        int []arr={2,4,5,3,1};
        arr=bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int [] bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
