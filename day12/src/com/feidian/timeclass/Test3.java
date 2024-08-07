package com.feidian.timeclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d1 =new Date();
        System.out.println(sdf.format(d1));
        //System.out.println(sdf2.format(d1));
    }
}
