package com.feidian.code;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1= new Phone();
        phone1.name="xiaomi";
        phone1.price=1999;
        System.out.println(phone1.name);
        System.out.println(phone1.price);
        phone1.call();
        phone1.playGame();
        Phone phone2;
        phone2=phone1;
        System.out.println(phone2.name);
        System.out.println(phone2.price);
        phone2.call();
        phone2.playGame();

    }
}
