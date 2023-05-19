package com.xworkz.assignment;

import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bank id");
        int bankId = sc.nextInt();
        System.out.println("enter account number ");
        long number = sc.nextLong();
        System.out.println("enter branch");
        String branch = sc.next();
        System.out.println("enter type");
        String type = sc.next();
        System.out.println("enter ifsc code ");
        String ifscCode = sc.next();
        System.out.println("enter bank location");
        String location = sc.next();

        Bank bank = new Bank();
        bank.setBankId(bankId);
        bank.setNumber(number);
        bank.setType(type);
        bank.setBranch(branch);
        bank.setIfscCode(ifscCode);
        bank.setLocation(location);

        System.out.println(bank.getBankId() + " " + bank.getNumber() + " " + bank.getType() + " " + bank.getBranch() + " " + bank.getIfscCode() + " " + bank.getLocation());

    }
}