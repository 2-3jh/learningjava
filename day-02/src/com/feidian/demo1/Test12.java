package com.feidian.demo1;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1=number;
        int number2=0;
        while(number1!=0){
            int a=number1%10;
            number1/=10;
            number2=number2*10+a;
        }
        if(number==number2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
