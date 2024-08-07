package com.feidian.day03;

public class Test2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        //int max = printArr(arr);
        //System.out.println(max);
        boolean result= isHave(arr,5);
        System.out.println(result);
    }
    public static int printArr(int []arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static boolean isHave(int []arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i])
                return true;
        }
        return false;
    }
}
