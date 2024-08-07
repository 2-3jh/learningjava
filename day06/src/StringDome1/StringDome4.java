package StringDome1;

import java.util.Scanner;

public class StringDome4 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int capital=0,low=0,num=0;
        for (int i = 0; i < str.length(); i++) {
            char a=str.charAt(i);
            if(a>64&&a<=90){
                capital+=1;
            }else if(a>=97&&a<=122){
                low+=1;
            }else if(a<=57&&a>=48){
                num+=1;
            }
        }
        System.out.println("有"+capital+"个大写字母，"+low+"个小写字母,"+num+"个数字");
    }
}
