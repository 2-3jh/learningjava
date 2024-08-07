package com.feidian.code;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int []arr={2,588,888,1000,10000};
        int i=0;
        Random r=new Random();
        while(i!=5){
            int index=r.nextInt(5);
            if(arr[index]!=0){
                System.out.println(arr[index]+"元的奖金被抽出");
                arr[index]=0;
                i++;
            }
        }
    }
}
