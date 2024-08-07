package com.feidian.test3;

public class Dog extends Animal implements Swim{
    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }

    @Override
    public void doSometing() {
        System.out.println("狗吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
