package Test2;

import java.sql.SQLOutput;

public class GoodsTest {
    public static void main(String[] args) {
        Goods []goods=new Goods[3];
        Goods goods1=new Goods(01,"肥皂",5.5,100);
        goods[0]=goods1;
        System.out.println(goods[0].getName());
    }

}
