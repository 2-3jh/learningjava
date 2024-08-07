package com.feidian.stringdome;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        if(str.equals(sb.reverse().toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
