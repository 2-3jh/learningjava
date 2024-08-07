package com.feidian.code;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请依次输入原票价，月份和舱类型1头等舱，2经济舱");
        Scanner sc = new Scanner(System.in);
        double price=sc.nextDouble();
        int month=sc.nextInt();
        int type = sc.nextInt();
        if(month>=5&&month<=10){
            System.out.println(cal(price,0.85));
        }else if(month==11||month==12||(month>=1&&month<=4)){
            System.out.println(cal(price,0.65));
        }
    }
    public static double cal(double price, double account){
        return price*account;
    }
}
