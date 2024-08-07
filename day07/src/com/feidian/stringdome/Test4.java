package com.feidian.stringdome;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("请输入两个字符串");
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isSeem(str1,str2));
    }
    public static boolean isSeem(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
        str1=str1.substring(1)+str1.charAt(0);
        if(str1.equals(str2))
            return true;
        }
        return false;
    }
}
