package com.feidian.dome1;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDome1 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime time1=ZonedDateTime.of(2024,10,10,10,10,25,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        Instant now1=Instant.now();
        ZonedDateTime time2=ZonedDateTime.ofInstant(now1,ZoneId.systemDefault());
        System.out.println(time2);
    }
}
