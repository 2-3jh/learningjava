package Test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars=new Car[3] ;
        System.out.println("请输入三辆车的信息");
        Scanner sc=new Scanner(System.in);
        String brand,color;
        double price;
        Car car1=new Car("宝马",100,"红色");
//        for(int i=0;i<3;i++){
//            brand=sc.next();
//            cars[i].setBrand(brand);
//            price=sc.nextDouble();
//            cars[i].setPrice(price);
//            color=sc.next();
//            cars[i].setColor(color);
//        }

        cars[1]=car1;
        System.out.println(cars[1].getBrand());

    }
}
