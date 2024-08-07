package com.feidian.Test5;

public abstract class Athlete {
    private String name;
    private int age;
    public abstract void doing();

    public Athlete() {
    }

    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
