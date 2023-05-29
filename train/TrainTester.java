package com.xworkz.train;

public class TrainTester {
    public static void main(String[] args) {
        Compartment compartment=new Compartment();
        Train train=new Train(compartment);
        train.compartment.toSit();
    }
}
