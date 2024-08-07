package com.feidian.timeclass;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        Date d1=new Date();
        d1.setTime(d1.getTime());
        SimpleDateFormat s1=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(s1.format(d1));
        Date d2 = s1.parse("2025年2月02日 13时25分21秒");
        System.out.println(d2);

    }
}
