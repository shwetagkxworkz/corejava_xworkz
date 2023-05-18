package com.xworkz.shop;

public class CakeTester {
    public static void main(String[] args) {
        Cake cake1=new Cake("Round","choclate",1000 ,"brown",2000 );
        System.out.println(cake1.shape + " "+ cake1.flavour +" "+ cake1.weight + " "+ cake1.color + " " +cake1.price);

        Cake cake2=new Cake("Square","pineapple",2000 ,"yellow",1500);
        System.out.println(cake2.shape + " "+ cake2.flavour +" "+ cake2.weight + " "+ cake2.color+ " " +cake2.price);

        Cake cake3=new Cake("heart","straberry",200,"red",2000);
        System.out.println(cake3.shape + " "+ cake3.flavour +" "+ cake3.weight + " "+ cake3.color+ " " +cake3.price);

        Cake cake4=new Cake("double layer","mango",5000,"yellow",3000);
        System.out.println(cake4.shape + " "+ cake4.flavour +" "+ cake4.weight + " "+ cake4.color+ " " +cake4.price);

        Cake cake5=new Cake("round","cream",500,"white",1500);
        System.out.println(cake5.shape + " "+ cake5.flavour +" "+ cake5.weight + " "+ cake5.color+ " " +cake5.price);

    }

}

