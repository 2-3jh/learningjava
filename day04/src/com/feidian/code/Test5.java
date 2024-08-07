package com.feidian.code;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的数字");
        int number = sc.nextInt();
        System.out.println(getNumber(number));
    }

    public static int getNumber(int number) {
        int next = 0;
        for (int i = 0; i < 4; i++) {
            next = next * 10 + (number % 10 + 5) % 10;
            number /= 10;
        }
        return next;
    }
}
