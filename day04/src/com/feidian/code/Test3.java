package com.feidian.code;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 4; i++) {
            int a = r.nextInt(25);
            if (r.nextBoolean()) {
                str = (char)(a + 65) + str;
            } else {
                str = (char)(a + 97) + str;
            }
        }
        str = str + r.nextInt(9);
        System.out.println(str);
    }
}
