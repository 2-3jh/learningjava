package com.feidian.test3;

public class Objecttest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu1=new Student("zhangsan",18);
        Student stu2=new Student("zhangsan",18);
        System.out.println(stu1.equals(stu2));
        Object obj=stu1.clone();
        System.out.println(obj.toString());
    }
}
