package com.feidian.dome1;

import java.sql.DataTruncation;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDome1 {
    public static void main(String[] args) {
        ZonedDateTime time = Instant.now().atZone(ZoneId.systemDefault());
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time));
    }
}
