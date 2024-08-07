package com.feidian.demo1;

public class Test11 {
    public static void main(String[] args) {
        int high = 8844430;
        double sum = 0.1;
        int count = 0;
        while (sum <= high) {
            sum *= 2;
            count++;
        }
        System.out.println(count);
    }
}
