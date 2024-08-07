package com.feidian.demo1;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(m(20));
    }
    public static int m(int step){
        if(step==1){
            return 1;
        }
        if(step==2){
            return 2;
        }
        if(step==3){
            return 4;
        }
        return m(step-1)+m(step-2)+m(step-3);
    }
}
