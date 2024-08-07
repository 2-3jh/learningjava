package com.feidian.demo1.fortest;

import java.util.Scanner;

public class teat2 {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i % 15 == 0) {
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
