package com.feidian.code;

public class Test2 {
    public static void main(String[] args) {
        int count=0;
        for(int i=101;i<201;i++){
            count+=judge(i);
        }
        System.out.println(count);
    }
    public static int judge(int number){
        for(int i=2;i<number;i++){
            if(number%i==0)
                return 0;
        }
        return 1;
    }
}
