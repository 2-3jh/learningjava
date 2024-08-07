package com.feidian.Test5;

public class BbAthlete extends Athlete implements SpeakEnglish{
    @Override
    public void doing() {
        System.out.println("学打篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    public BbAthlete() {
    }

    public BbAthlete(String name, int age) {
        super(name, age);
    }
}
