package com.feidian.Test5;

public class PpAthlete extends Athlete implements SpeakEnglish{

    @Override
    public void doing() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    public PpAthlete() {
    }

    public PpAthlete(String name, int age) {
        super(name, age);
    }
}
