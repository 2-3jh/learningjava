package com.feidian.demo1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("你考了多少分");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=100&&a>=0){
            if ( a >= 95) {
                System.out.println("I will buy a bike for you.");
            } else if(a>=90) {
                System.out.println("I will bring you to play.");
            }else if(a>=80){
                System.out.println("我将送你一个变形金刚。");
            }else{
                System.out.println("等着挨揍把你。");
            }
        }else {
            System.out.println("你这分有问题吧。");
        }
    }
}
