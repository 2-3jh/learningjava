package com.feidian.dome1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDome {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        LocalDate ld1=LocalDate.of(2024,10,1);
        System.out.println(ld1);
        System.out.println(ld);
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalDateTime ldt=LocalDateTime.now();
        LocalDateTime ldt1=LocalDateTime.of(2024,10,1,11,36,52);
        System.out.println(ldt);
        System.out.println(ldt1.toLocalDate());
        System.out.println(ldt1.toLocalTime());
        System.out.println(ldt1.getDayOfWeek().getValue());

    }
}
