package com.feidian.demo1;

import javax.swing.*;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        System.out.println("输入两个数");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int mod = 0;
        while (a >= b) {
            a -= b;
            mod = a;
            count++;
        }
        System.out.println("商" + count + "余" + mod);
    }
}
