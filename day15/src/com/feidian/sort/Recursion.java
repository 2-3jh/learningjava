package com.feidian.sort;

public class Recursion {
    public static void main(String[] args) {
        int sum;
        sum=method(100);
        System.out.println(sum);
    }

    private static int method(int i) {
        if(i==1){
            return 1;
        }
        return method(i-1)+i;
    }
}
