package com.feidian.spider;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str="java11,c77,java89";
        //获取正则表达式的对象
        Pattern p = Pattern.compile("java\\d{0,2}");
        //获取文本提取器对象
        Matcher m = p.matcher(str);
        //find 底层会记录起始索引和结束索引加1
        System.out.println(m.find());
        //根据find的索引记录进行字符串的截取
        System.out.println(m.group());
        //再使用find会继续向后读
    }
}
