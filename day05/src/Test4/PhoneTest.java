package Test4;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        String brand,color;
        double price;
        Phone []phones=new Phone[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三部手机的信息。");
        for(int i=0;i<3;i++){
            brand=sc.next();
            price=sc.nextDouble();
            color=sc.next();
            Phone phone=new Phone(brand,price,color);
            phones[i]=phone;
        }
        double sum=0;
        for (int i = 0; i < phones.length; i++) {
            sum+=phones[i].getPrice();
            System.out.println(phones[i].getBrand()+" "+phones[i].getPrice()+" "+phones[i].getColor());
        }
        System.out.println("平均价格是"+sum/phones.length+"元");
    }
}
