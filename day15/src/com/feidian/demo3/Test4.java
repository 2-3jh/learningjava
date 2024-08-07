package com.feidian.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        Date d1=sdf1.parse("2005年1月1日");
        long t1 = d1.getTime();
        long t2=System.currentTimeMillis()-t1;
        System.out.println("出生了"+t2/(1000*60*60*24)+"天");
    }
}
