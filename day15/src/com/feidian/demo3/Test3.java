package com.feidian.demo3;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(123456));

    }

    private static String toBinaryString(int i) {
        StringBuilder sb=new StringBuilder();
        while(i>0){
            sb.append(i%2);
            i/=2;
        }
        return sb.reverse().toString();
    }
}
