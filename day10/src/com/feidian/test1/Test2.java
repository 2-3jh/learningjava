package com.feidian.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println("请输入一个数");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(ifIs(n));
        long l1=System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            if(ifIs(i))
                System.out.println(i);
        }
        System.out.println((System.currentTimeMillis()-l1)/1000.0);
    }
    public static boolean ifIs(int n){
        int digit=0,m=n;
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n/=10;
            digit++;
        }
        double sum=0;
        for (int i = 0; i < digit; i++) {
            sum+=Math.pow(list.get(i),digit);
        }
        if(sum==m)
        return true;
        return false;
    }

}
