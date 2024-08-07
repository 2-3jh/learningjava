package com.feidian.test1;

public class Test2 {
    public static void main(String[] args) {
        String regex1="(.).+\\1";
        System.out.println("abdvbbbba".matches(regex1));
        String regex2="(.+).+\\1";
        System.out.println("@#$jdslfjs@#$".matches(regex2));
        String regex3="((.)\\2*).+\\1";
        System.out.println("aaadsadaaa".matches(regex3));
        String regex4="1*";
        System.out.println("1".matches(regex4));
    }
}
