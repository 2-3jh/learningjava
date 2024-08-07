package com.feidian.studentsystem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        loop : while (true) {
            switch (choice) {
                case 0:
                    System.out.println("--------欢迎来到学生管理系统-------------");
                    System.out.println("1.添加学生                              ");
                    System.out.println("2.删除学生                              ");
                    System.out.println("3.修改学生信息                          ");
                    System.out.println("4.查找学生                              ");
                    System.out.println("5.退出                                   ");
                    System.out.println("请输入你的选择：");
                    choice = sc.nextInt();
                    break;
                case 1:
                    list = addStudent(list);
                    choice=0;
                    break;
                case 2:
                    list = removeStudent(list);
                    choice=0;
                    break;
                case 3:
                    list = resetStudent(list);
                    choice=0;
                    break;
                case 4:
                    getStudent(list);
                    choice=0;
                    break;
                case 5:
                    break loop;
                default:
                    choice = 0;
            }
        }
    }
    public static void getStudent(ArrayList<Student> list){
        System.out.println("请输入学生的学号");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=isExist(list,str);
        if(num==-1){
            System.out.println("查无此人");
        }else{
            Student stu=list.get(num);
            System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAddress()+" "+stu.getAge());
        }
    }
    public static ArrayList<Student> resetStudent(ArrayList<Student> list){
        System.out.println("请输入学生id");
        Scanner sc=new Scanner(System.in);
        int num=isExist(list,sc.next());
        if(num!=-1){
            System.out.println("请重新输入学生信息");
            list.set(num,new Student(list.get(num).getId(),sc.next(),sc.next(),sc.nextInt()));
        }else{
            System.out.println("查无此人");
        }
        return list;
    }
public static ArrayList<Student> removeStudent(ArrayList<Student> list){
    System.out.println("请输入学生的id");
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int num=isExist(list,str);
    if(num!=-1){
        list.remove(num);
        System.out.println("删除成功");
    }else{
        System.out.println("无此人");
    }
    return list;
}
    public static int isExist(ArrayList<Student> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(str))
                return i;
        }
        return -1;
    }

    public static ArrayList<Student> addStudent(ArrayList<Student> list) {
        System.out.println("请输入学生信息");
        Scanner sc = new Scanner(System.in);
        Student stu = new Student(sc.next(), sc.next(), sc.next(), sc.nextInt());
        if (isExist(list, stu.getId())==-1) {
            list.add(stu);
            System.out.println("成功添加");
        } else {
            System.out.println("id重复");
        }
        return list;
    }
}
