package com.xworkz.savings;

public class CurrentAccountTester {
    public static void main(String[] args) {
        CurrentAccount currentAccount=new CurrentAccount();
        System.out.print("check balance before credit"+ currentAccount.getBalance());
        currentAccount.creadit(5000.80);
        double total=currentAccount.getBalance();
        currentAccount.debit(2000);
        double balance=currentAccount.getBalance();
        System.out.println("check balance after" + currentAccount.getBalance());


    }
}
