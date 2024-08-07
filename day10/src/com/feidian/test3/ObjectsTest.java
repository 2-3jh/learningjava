package com.feidian.test3;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = null;
        System.out.println(Objects.equals(stu1, stu2));
        System.out.println(Objects.isNull(stu1));
        System.out.println(Objects.isNull(stu2));
        System.out.println(Objects.nonNull(stu1));
        System.out.println(Objects.nonNull(stu2));
    }
}
