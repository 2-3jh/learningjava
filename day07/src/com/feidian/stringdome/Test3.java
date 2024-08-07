package com.feidian.stringdome;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入一个长度小于十的字符串且内容只能是数字");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        while(true){
            if(str.length()>9){
                System.out.println("请重新输入");
                str=sc.next();
            }else{
                int flag=0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i)<48||str.charAt(i)>57) {
                        System.out.println("请重新输入");
                        str=sc.next();
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    break;
                }
            }
        }
        String []table={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        String newString="";
        for (int i = 0; i < str.length(); i++) {
            newString=newString+table[str.charAt(i)-48];
        }
        System.out.println(newString);
    }
}
