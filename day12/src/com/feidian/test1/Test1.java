package com.feidian.test1;

public class Test1 {
    public static void main(String[] args) {
        String regex1="1[3-9]\\d{9}";
        String regex2="\\w+@[\\w&&^_]{2,6}\\(.[a-zA-Z]{2,3})+";
        String regex3="[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
    }
}
