package com.feidian.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Test6 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy/MM/dd");
        Date d1= sdf1.parse("2024/3/1");
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(d1);
        cal1.set(2024,3,1);
        cal1.add(Calendar.DAY_OF_MONTH,-1);
        if(cal1.get(4)==28){
            System.out.println("不是闰年");
        }else{
            System.out.println("是闰年");
        }
        LocalDateTime lt1=LocalDateTime.now();

    }
}
