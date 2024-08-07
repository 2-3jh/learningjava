package com.feidian.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {
        String[]str={"fds","fs","dfsf"};
        Arrays.sort(str, ( o1,  o2)-> o1.length()-o2.length()
        );
        System.out.println(Arrays.toString(str));
    }
}
