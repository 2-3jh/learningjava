package com.feidian.staticdemo1;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三","男",18));
        list.add(new Student("李四","女",19));
        list.add(new Student("王武","男",17));
        System.out.println(StudentUtil.getMAaxAge(list));
    }
}
