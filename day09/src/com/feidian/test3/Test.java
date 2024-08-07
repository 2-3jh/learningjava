package com.feidian.test3;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("jd",2);
        mm(dog);
        dog.swim();
    }
    public static void mm(Animal nn){
        nn.doSometing();
    }
}
