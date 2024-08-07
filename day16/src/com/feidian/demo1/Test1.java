package com.feidian.demo1;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend[] gs = new GirlFriend[3];
        gs[0] = new GirlFriend("abc", 18, 180);
        gs[1] = new GirlFriend("fss", 19, 170);
        gs[2] = new GirlFriend("ds", 19, 170);
        Arrays.sort(gs, (o1, o2) -> {
            if (o1.getAge() != o2.getAge())
                return o1.getAge() - o2.getAge();
            if (o1.getHeight() != o2.getHeight()) {
                return (o1.getHeight() - o2.getHeight())>0?1:-1;
            }
            return o1.getName().compareTo(o2.getName());
        });
        for (int i = 0; i < gs.length; i++) {
            System.out.println(gs[i].toString());
        }
    }
}
