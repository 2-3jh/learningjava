package com.feidian.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        while(sum<=200){
            System.out.println("请输入1-100整数");
            String str = sc.nextLine();
            int a=Integer.parseInt(str);
            if(a<=100&&a>=0){
                sum+=a;
                list.add(a);
            }else{
                System.out.println("输入错误");
            }
        }
        System.out.println("输入完成");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
    }
}
