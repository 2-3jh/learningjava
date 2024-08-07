package com.feidian.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        for(String s:coll){
            System.out.println(s);
        }
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
