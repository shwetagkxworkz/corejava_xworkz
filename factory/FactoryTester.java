package com.xworkz.factory;

public class FactoryTester {
    public static void main(String[] args) {
        Machines machine=new Machines();
        Factory factory=new Factory(machine);
        factory.machine.toWork();
    }
}
