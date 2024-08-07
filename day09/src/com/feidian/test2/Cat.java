package com.feidian.test2;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }
    @Override
    public void eat(String something){
        System.out.println("" +getAge()+getColor()+"吃"+something);
    }
    @Override
    public void canDo(){
        System.out.println("捉鱼");
    }
}
