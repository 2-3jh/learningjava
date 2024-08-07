package com.feidian.dome2;

import java.util.Scanner;

public class PackagingCategory {
    public static void main(String[] args) {
        Integer i1=new Integer(12);
        System.out.println(i1);
        int i=i1.intValue();
        System.out.println(i);
        Integer i2=new Integer("123");
        Integer i3=new Integer(12);
        System.out.println(i2);
        System.out.println(13==i1);
        Integer i4=Integer.valueOf("123");
        Integer i5=Integer.valueOf(123);
        System.out.println(i4==i5);
        //方法
        //1.整数转为二，八，十六进制，用String储存
        System.out.println(Integer.toBinaryString(120));
        System.out.println(Integer.toOctalString(120));
        System.out.println(Integer.toHexString(120));
        //2.String转为int类型
        System.out.println(Integer.parseInt("123456")+1);
        System.out.println(Integer.parseInt("123123"));
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int a=Integer.parseInt(str);
        System.out.println(a);
    }
}
