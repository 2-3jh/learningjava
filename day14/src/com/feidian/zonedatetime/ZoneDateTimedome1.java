package com.feidian.zonedatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimedome1 {
    public static void main(String[] args) {
        ZonedDateTime zdt1=ZonedDateTime.now();
        ZonedDateTime zdt2=ZonedDateTime.of(2024,8,1,12,10,10,0, ZoneId.systemDefault());
        System.out.println(zdt2);

    }
}
