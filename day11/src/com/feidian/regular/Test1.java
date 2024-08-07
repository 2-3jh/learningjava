package com.feidian.regular;

public class Test1 {
    public static void main(String[] args) {
        String str="1sdf65156s";
        System.out.println(str.matches("\\w{4,16}"));
        String str1="12345678912345678x";
        System.out.println(str1.matches("\\d{17}(x|X)"));
    }
}
