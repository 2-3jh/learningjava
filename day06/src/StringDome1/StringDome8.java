package StringDome1;

public class StringDome8 {
    //    public static void main(String[] args) {
//        long number=19511065883l;
//        System.out.println(getNumber(number));
//    }
//    public static String getNumber(long number){
//       String str="";
//        for(int i=0;i<11;i++){
//            long a = number%10;
//            number/=10;
//            if(i>3&&i<8){
//                str="*"+str;
//            }else{
//                str=a+str;
//            }
//        }
//        return str;
//    }
    public static void main(String[] args) {
    String number="19511065883";
    String str="";
    str+=number.substring(0,3)+"****"+number.substring(7);
        System.out.println(str);
    }
}
