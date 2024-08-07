package com.feidian.stringdome;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入一个字=字符串");
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        System.out.println(disruption(str));
    }
    public static String disruption(String str){
        char []arr=str.toCharArray();
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            char temp=arr[i];
            int j=r.nextInt(i,arr.length);
            arr[i]=arr[j];
            arr[j]=temp;
        }
        String str1=new String(arr);
        return str1;
    }
}
