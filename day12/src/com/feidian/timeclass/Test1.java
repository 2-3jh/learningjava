package com.feidian.timeclass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setTime(0L);
        System.out.println(d1.getTime());
        System.out.println(d1);

    }
}
