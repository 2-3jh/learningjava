package StringDome1;

import java.util.Scanner;

public class StringDome7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        System.out.println(getString(money));
    }
    public static String getString(int money){
        int i=0;
        String str="";
        while(i<7){
            int a=money%10;
            money/=10;
            switch(a){
                case 0->str="零"+str;
                case 1->str="壹"+str;
                case 2->str="贰"+str;
                case 3->str="叁"+str;
                case 4->str="肆"+str;
                case 5->str="伍"+str;
                case 6->str="陆"+str;
                case 7->str="柒"+str;
                case 8->str="捌"+str;
                case 9->str="玖"+str;
            }
            i++;
        }
        str=str.charAt(0)+"百"+str.charAt(1)+"拾"+str.charAt(2)+"万"+str.charAt(3)+"仟"+str.charAt(4)+"佰"+str.charAt(5)+"拾"+str.charAt(6)+"元";
        return str;
    }
}
