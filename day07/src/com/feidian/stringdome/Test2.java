package com.feidian.stringdome;

public class Test2 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println( montage(arr));
    }
    public static String montage(int []arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]+",");
        }
        sb.append(arr[arr.length-1]+"]");
        return sb.toString();
    }
}
