package com.feidian.test3;

public class Frog extends Animal{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSometing() {
        System.out.println("青蛙可以吃虫子");
    }
}
