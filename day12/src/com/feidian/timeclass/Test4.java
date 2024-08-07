package com.feidian.timeclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf1.parse("2023年11月11日 0:0:0");
        Date end = sdf1.parse("2023年11月11日 0:10:0");
        Date d = sdf1.parse("2023年11月11日 0:01:00");
        if(d.getTime()>=start.getTime()&&d.getTime()<=end.getTime()){
            System.out.println("参加了");
        }else{
            System.out.println("没有参加");
        }
    }
}
