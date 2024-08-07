package com.feidian.code;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend zhang=new GirlFriend();
        zhang.name="张箫";
        zhang.age=18;
        zhang.height=170;
        zhang.weight=60;
        System.out.println(zhang.name+" "+zhang.age+"岁 "+zhang.height+"cm "+zhang.weight+"kg ");
        zhang.doingThing();
    }
}
