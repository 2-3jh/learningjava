package com.feidian.stringdome;

public class Test7 {
    public static void main(String[] args) {
        String str="mkm d";
        System.out.println(findLast(str));
    }
    public static int findLast(String str){
        char[] arr = str.toCharArray();
        int postion=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                postion=i;
            }
        }
        return arr.length-1-postion;
    }
}
