package com.feidian.Test5;

public class PpCatch extends Athlete {
    @Override
    public void doing() {
        System.out.println("教打乒乓球");
    }


    public PpCatch(SpeakEnglish c) {
        c.speakEnglish();
    }

    public PpCatch(String name, int age) {
        super(name, age);
    }
}
