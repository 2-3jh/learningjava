package com.feidian.staticdemo1;
import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){};
    public static int getMAaxAge(ArrayList<Student> list){
        int max=list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if(max< list.get(i).getAge())
                max=list.get(i).getAge();
        }
        return max;
    }
}
