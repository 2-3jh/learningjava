package StringDome1;

import java.util.Scanner;

public class StringDome2 {
    public static void main(String[] args) {
        String account="BCDEFG";
        String password="132456";
        Scanner sc=new Scanner(System.in);
        int i=0;
        do{
            System.out.println("请输入账号");
            String s1=sc.next();
            System.out.println("请输入密码");
            String s2=sc.next();
            i++;
            account.equals(s1);
            s2.equals(password);
        }while(i<3);
    }
}
