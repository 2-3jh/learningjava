package com.feidian.Test6;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Father.Child ch=new Father().new Child();
        System.out.println(ch.name);
        ch.show();
    }

}
