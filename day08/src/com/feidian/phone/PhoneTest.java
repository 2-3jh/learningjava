package com.feidian.phone;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list=getInfo(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getBrand());
        }
    }
    public static ArrayList<Phone> getInfo(ArrayList<Phone> list){
        ArrayList<Phone> li=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                li.add(list.get(i));
            }
        }
        return li;
    }
}
