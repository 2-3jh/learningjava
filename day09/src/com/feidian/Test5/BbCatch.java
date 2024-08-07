package com.feidian.Test5;

public class BbCatch extends Athlete {
    @Override
    public void doing() {
        System.out.println("教打篮球");
    }

    public BbCatch() {
    }

    public BbCatch(String name, int age) {
        super(name, age);
    }
}
