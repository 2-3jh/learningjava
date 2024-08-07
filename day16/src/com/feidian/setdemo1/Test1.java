package com.feidian.setdemo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<String> set=new HashSet();
        //添加元素
        System.out.println(set.add("z"));
        set.add("z");
        System.out.println(set.add("n"));
        set.add("m ");
        System.out.println(set);
        //遍历
        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for (String s : set) {
            System.out.print(s);
        }
        set.forEach(s-> System.out.print(s));
    }
}
