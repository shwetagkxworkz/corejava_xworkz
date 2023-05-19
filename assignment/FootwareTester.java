package com.xworkz.assignment;
import java.util.Scanner;
public class FootwareTester {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter details of footware");
      int id=sc.nextInt();
      String brand=sc.next();
      int size=sc.nextInt();
      double price=sc.nextDouble();
      String materialType=sc.next();

      Footware foot=new Footware();
      foot.setId(id);
      foot.setBrand(brand);
      foot.setSize(size);
      foot.setPrice(price);
      foot.setMaterialType(materialType);

      System.out.println(foot.getId()+ " " +foot.getBrand()+ " " + foot.getSize()+ " " +foot.getPrice()+" " +foot.getMaterialType());
    }
}
