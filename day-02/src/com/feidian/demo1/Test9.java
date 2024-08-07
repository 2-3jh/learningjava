package com.feidian.demo1;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 ->
                System.out.println("机票查询");
            case 2 ->
                System.out.println("机票预定");
            case 3 ->
                System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
