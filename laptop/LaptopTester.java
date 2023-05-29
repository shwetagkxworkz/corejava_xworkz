package com.xworkz.laptop;

public class LaptopTester {
    public static void main(String[] args) {
        Hardisk hardisk=new Hardisk();
        Laptop laptop=new Laptop(hardisk);
        laptop.hardisk.toStoreData();
    }
}
