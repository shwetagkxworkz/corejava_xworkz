package com.xworkz.teaapp;
import java.util.Scanner;
public class TeaTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Tea tea=new Tea();
        for (int i=0; i<tea.teaNames.length; i++){
            System.out.println("enter tea names");
            String name=sc.next();
            tea.addTeaName(name);
        }
        tea.getTeaNames();
    }
        }


