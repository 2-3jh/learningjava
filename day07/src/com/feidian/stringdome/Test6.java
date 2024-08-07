package com.feidian.stringdome;

public class Test6 {
    public static void main(String[] args) {
        String num1="12345";
        String num2="12345";
        int sum=toNumber(num1)*toNumber(num2);
        System.out.println(sum);
        System.out.println(numToString(sum));
    }
    public static String numToString(int num){
        String str="";
        while(num!=0){
            str=num%10+str;
            num/=10;
        }
        return str;
    }
    public static int toNumber(String num){
        char [] arr=num.toCharArray();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum*10+arr[i]-48;
        }
        return sum;
    }
}
