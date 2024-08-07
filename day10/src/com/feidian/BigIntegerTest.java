package com.feidian;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerTest {
    public static void main(String[] args) {
        Random r=new Random();
        BigInteger bi=new BigInteger(20,r);
        System.out.println(bi);
        String str1="a";
        BigInteger bi1=new BigInteger(str1,16);
        System.out.println(bi1);
        System.out.println(BigInteger.valueOf(12)==BigInteger.valueOf(12));
    }
}
