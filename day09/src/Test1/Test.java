package Test1;

public class Test {
    public static void main(String[] args) {
        Child c=new Child("zha",18);
        test(c);
    }
    public static void test(Father n){
        n.show();
    }
}
