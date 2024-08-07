package com.feidian.stringdome;

public class StringBuildDome3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("张梦雅大傻逼");
        sb.append(1);
        sb.append('f');
        sb.append(true);
        sb.append("dfas");
        System.out.println(sb);
        sb.reverse();
        String str=sb.toString();
        System.out.println(str);
    }
}
