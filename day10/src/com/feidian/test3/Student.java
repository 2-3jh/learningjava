package com.feidian.test3;

import java.util.Objects;

public class Student implements Cloneable{
    private String str;
    private int age;

    public Student() {
    }

    public Student(String str, int age) {
        this.str = str;
        this.age = age;
    }


    public String getStr() {
        return str;
    }


    public void setStr(String str) {
        this.str = str;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(str, student.str);
    }


    @Override
    public String toString() {
        return "Student{str = " + str + ", age = " + age + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
