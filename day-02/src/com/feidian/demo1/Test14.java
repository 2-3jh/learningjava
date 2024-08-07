package com.feidian.demo1;

public class Test14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            } else {
                int a = i;
                while (a != 0) {
                    if (a % 10 == 7) {
                        System.out.println(i);
                        break;
                    }
                    a /= 10;
                }
            }
        }
    }
}
