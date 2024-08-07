package com.feidian.Test6;

public class Father {
    String name="fd";
     class Child{
        String name ="child";
        public void show(){
            System.out.println(Father.this.name);
        }
    }
}
