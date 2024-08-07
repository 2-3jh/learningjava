package com.feidian.test1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个大于2的正整数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(ifIs(a));
    }

    public static boolean ifIs(int a) {
        double m = Math.sqrt(a);
        for (int i = 2; i <= m; i++) {
            if (a % 2 == 0)
                return false;
        }
        return true;
    }
}
