package com.feidian.student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.setName( sc.next());
        s1.setAge(sc.nextInt()) ;
        list.add(s1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getName() + " ");
            System.out.println(list.get(i).getAge());
        }
    }
}
