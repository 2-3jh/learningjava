package com.feidian.staticdemo1;

public class Student {
    private String name,gener;
    private int age;

    public Student() {
    }

    public Student(String name, String gener, int age) {
        this.name = name;
        this.gener = gener;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
