package com.feidian.arraylist;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        System.out.print("[");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println(list.get(list.size()-1)+"]");
    }
}
