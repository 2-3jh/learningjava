package StringDome1;

import java.util.Scanner;

public class StringDome6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println(reString(str));
    }
    public static String reString(String str){
        String str1="";
        for (int i = str.length()-1; i > -1; i--) {
            str1=str1+str.charAt(i);
        }
        return str1;
    }
}
