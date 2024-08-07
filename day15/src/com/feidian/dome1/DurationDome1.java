package com.feidian.dome1;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDome1 {
    public static void main(String[] args) {
        LocalDateTime ldt1=LocalDateTime.now();
        LocalDateTime ldt2=LocalDateTime.of(2025,1,1,0,0,0);
        Duration dur = Duration.between(ldt1,ldt2);
        System.out.println(dur);
        System.out.println(dur.toDays());
        System.out.println(dur.toDaysPart());
    }
}
