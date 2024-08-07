package com.feidian.test2;

public class Pet {
    private String color;
    private int age;
    public void eat(String something){
        System.out.println("pet吃"+something);
    }
    public void canDo(){
        System.out.println("pet can do");
    }

    public Pet() {
    }

    public Pet(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
