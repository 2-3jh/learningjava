package com.feidian.demo1;

public class Test2 {
    public static void main(String[] args) {
        int []num=new int [10];
        num[0]=1;
        for (int i = 1; i < num.length; i++) {
            num[i]=2*(num[i-1]+1);
        }
        System.out.println(num[9]);
        System.out.println(m(10));
    }
    public static int m(int day){
        if(day==1)
            return 1;
        return 2*(m(day-1)+1);
    }
}
