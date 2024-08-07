package com.feidian.dome1;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDome1 {
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.of(2025,1,1);
        LocalDate ld2=LocalDate.of(2024,8,5);
        Period p1= Period.between(ld2,ld1);
        System.out.println(p1);
        System.out.println(p1.getYears());
        System.out.println(p1.getMonths());
        System.out.println(p1.getDays());
    }
}
