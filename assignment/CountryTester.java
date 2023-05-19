package com.xworkz.assignment;

import java.util.Scanner;

public class CountryTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter all details of country");
        int id=sc.nextInt();
        String name=sc.next();
        int code=sc.nextInt();
        int noOfStates= sc.nextInt();
        double population= sc.nextDouble();
        String currency=sc.next();
        String capital=sc.next();

        Country country=new Country();
        country.setId(id);
        country.setCode(code);
        country.setName(name);
        country.setNoOfStates(noOfStates);
        country.setPopulation(population);
        country.setCurrency(currency);
        country.setCapital(capital);

        System.out.println(country.getId()+ " " +country.getCode()+ " " +country.getName()+ " " +country.getNoOfStates()+" "+ country.getPopulation()+ " " +country.getCurrency()+ " " +country.getCapital());

    }
}
