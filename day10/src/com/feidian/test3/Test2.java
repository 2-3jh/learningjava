package com.feidian.test3;

import java.math.BigInteger;

public class Test2 {
    public static void main(String[] args) {
        BigInteger b1=new BigInteger("123456789");
        BigInteger b2 =BigInteger.valueOf(987654321L);
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.divideAndRemainder(b2)[0]);
        System.out.println(b1.divideAndRemainder(b2)[1]);
        //是否相同
        System.out.println(b1.equals(b2));
        //大的
        System.out.println(b1.max(b2));
        //小的
        System.out.println(b1.min(b2));
        //次幂
        System.out.println(b2.pow(2));
        //转化为整数
        System.out.println(b2.intValue());
    }
}
