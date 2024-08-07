package com.feidian.demo3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Test2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int num = parseInt1(str);
        System.out.println(num);


    }

    public static int parseInt1(String str) {
     if(str.matches("[1-9]\\d{0,9}")){
         int num=0;
         for (int i = 0; i <str.length(); i++) {
             num = num*10+(str.charAt(i)-48);
         }
         return num;
     }
return 0;

    }

}
