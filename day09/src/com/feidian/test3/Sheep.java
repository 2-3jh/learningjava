package com.feidian.test3;

public class Sheep extends Animal{
    @Override
    public void doSometing() {
        System.out.println("山羊吃草");
    }

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
