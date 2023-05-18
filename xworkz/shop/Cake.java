package com.xworkz.shop;

public class Cake {
    String shape;
    String flavour;
    double weight;
    String color;
    double price;
    public  Cake(){

    }
    public  Cake(String s, String flv, double weig, String colo, double pri){
        System.out.println("cake objects created");
        shape=s;
        flavour=flv;
        weight=weig;
        color=colo;
        price=pri;

    }
}
