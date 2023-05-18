package com.xworkz.pipe;

public class PipeTester {
    public static void main(String[] args) {
        Pipe pipe1=new Pipe(500, 30,15, "vectus", "blue");
        System.out.println(pipe1.price+ " " + pipe1.length + " " + pipe1.diameter + " " + pipe1.brand + " " + pipe1.color);

        Pipe pipe2=new Pipe(1000,20,15, "supreme", "white");
        System.out.println(pipe2.price+ " " + pipe2.length + " " + pipe2.diameter + " " + pipe2.brand + " " + pipe2.color);

        Pipe pipe3=new Pipe(2000, 50,5, "ashirvad", "black");
        System.out.println(pipe3.price+ " " + pipe3.length + " " + pipe3.diameter + " " + pipe3.brand + " " + pipe3.color);

        Pipe pipe4=new Pipe(1200,40,8, "finolex", "white");
        System.out.println(pipe4.price+ " " + pipe4.length + " " + pipe4.diameter + " " + pipe4.brand + " " + pipe4.color);

        Pipe pipe5=new Pipe(1000,30,10, "jain irrigation", "gray");
        System.out.println(pipe5.price+ " " + pipe5.length + " " + pipe5.diameter + " " + pipe5.brand + " " + pipe5.color);

    }
}
