package com.feidian.demo3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test5 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.of(2005,1,1);
        LocalDate d2=LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between(d1,d2));
    }
}
