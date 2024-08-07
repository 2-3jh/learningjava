package com.feidian.demo1;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        int a = 1000;
        System.out.println("请输入你的会员等级");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if(count == 1){
            System.out.println("你需要支付900元");
        }else if(count==2){
            System.out.println("你需要支付800元");
        }else if(count==3){
            System.out.println("你需要支付700元");
        }else{
            System.out.println("你需要支付1000元");
        }
    }
}
