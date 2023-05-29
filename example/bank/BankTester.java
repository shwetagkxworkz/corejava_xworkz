package com.xworkz.example.bank;

public class BankTester {
    public static void main(String[] args) {
        Department department=new Department();
        Bank bank=new Bank(department);
        bank.department.toDoFunction();
    }
}
