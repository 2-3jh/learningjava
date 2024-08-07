package com.feidian.timeclass;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Date d1=new Date(0L);
        //d1.setTime( d1.getTime()+1000L*60*60*24*365);
        System.out.println(d1);
        Random r=new Random();
        Date d2=new Date(Math.abs(r.nextInt()));
        Date d3=new Date(Math.abs(r.nextInt()));
        if(d2.getTime()>d3.getTime()){
            System.out.println("d3在前");
        }else if(d2.getTime()==d3.getTime()){
            System.out.println("两者相等");
        }else{
            System.out.println("d2在前");
        }

    }
}
