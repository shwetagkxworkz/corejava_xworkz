package com.xworkz.ecommerceapp;

import java.util.Scanner;

public class Etester {
    public static void main(String[] args) {
        System.out.println("main started");
      try {
          String s1 = null;
          String s2 = "shweta";
          s1.equals(s2);
      }catch (Exception e){
          e.printStackTrace();
      }

       try {
           String str = "876545k";
           Long l = Long.parseLong(str);
           System.out.println(l);
       }catch(Exception e){
           e.printStackTrace();
       }

      try {
          Scanner s = new Scanner(System.in);
          System.out.println("enter number");
          int a = s.nextInt();
          System.out.println(a);
      }catch (Exception e){
          e.printStackTrace();
      }

     try {
         int d = 2 / 0;
         System.out.println(d);
     }catch(Exception e){
         e.printStackTrace();
     }

     try {
         String name[] = new String[2];
         name[1] = "shweta";
         name[2] = "rekha";
         name[3] = "deepa";
     }catch(Exception e){
         e.printStackTrace();
     }

        System.out.println("main ended");
    }
}
