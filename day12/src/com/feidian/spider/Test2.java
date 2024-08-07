package com.feidian.spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        //贪婪读取
        String str1="abababababababababaaabbbbbbbbbbbbbbbbb";
        Pattern p = Pattern.compile("(ab)+");
        Matcher m = p.matcher(str1);
        m.find();
        System.out.println(m.group());
        String str="小诗诗dfmkdlvmfdkvmkvm小丹丹dfodjgdiojgdiojgd小慧慧";
        System.out.println(str.replaceAll("[\\w&&[^_]]+", "vs"));
        for (int i = 0; i < str.split("[\\w&&[^_]]+").length; i++) {
            System.out.println(str.split("[\\w&&[^_]]+")[i]);
        }
    }
}
