package com.feidian.override;

public class DogTest {
    public static void main(String[] args) {
        Husky dog1=new Husky();
        dog1.eat();
        dog1.drink();
        dog1.guardHome();
        dog1.distrustHome();
        Hapi hapi=new Hapi();
        hapi.eat();
        hapi.drink();
        hapi.guardHome();
        ChineseDog c=new ChineseDog();
        c.eat();
        c.drink();
        c.guardHome();

    }
}
