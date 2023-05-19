package com.xworkz.assignment;
import java.util.Scanner;
public class CakeTester {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter cake id");
    int cakeId=sc.nextInt();
    System.out.println("enter cake color");
    String color=sc.next();
    System.out.println("enter cake shape");
    String shape=sc.next();
    System.out.println("enter cake flavour");
    String flavour=sc.next();
    System.out.println("enter cake price");
    double price= sc.nextDouble();

    Cake cake=new Cake();
    cake.setCakeId(cakeId);
    cake.setColor(color);
    cake.setFlavaour(flavour);
    cake.setShape(shape);
    cake.setPrice(price);

    System.out.println(cake.getCakeId()+" " +cake.getColor()+ " " +cake.getShape()+ " " +cake.getFlavaour()+ " "+ cake.getPrice());
    }
}
