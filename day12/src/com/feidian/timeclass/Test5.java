package com.feidian.timeclass;

import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        Date d1 = cal.getTime();
        System.out.println(d1);
        System.out.println(cal.getTimeInMillis());
    }
}
