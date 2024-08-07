package com.feidian.setdemo1;

import java.util.HashSet;

public class Test2 implements Comparable<String>{
    public static void main(String[] args) {
        Student stu=new Student("zhang");
        Student stu1=new Student("zhang");
        System.out.println(stu.hashCode());
        System.out.println(stu1.hashCode());
        System.out.println("1234");
        System.out.println("1");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
