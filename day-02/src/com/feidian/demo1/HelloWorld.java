package com.feidian.demo1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("请输入你的座位号0-100：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>100&&a<0){
            if(a%2==1){
                System.out.println("坐在左边");
            }else{
                System.out.println("坐在右边");
            }
        }else{
            System.out.println("座位错误");
        }
    }
}


