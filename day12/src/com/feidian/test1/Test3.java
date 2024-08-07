package com.feidian.test1;

public class Test3 {
    public static void main(String[] args) {
        String str="我要学学编编编编程程程程程";
        System.out.println(str.replaceAll("((.)\\2+)", "\\\\$2"));
    }
}
