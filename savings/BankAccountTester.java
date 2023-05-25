package com.xworkz.savings;

import com.xworkz.bankaccount.BankAccount;
import com.xworkz.bankaccount.SavingAccount;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println("check balance before credit" +bankAccount.getBalance());
        bankAccount.creadit(5000.30);
        double total=bankAccount.getBalance();
        bankAccount.debit(3000);
        double balance=bankAccount.getBalance();
        System.out.println("check balance after debit" +bankAccount.getBalance());



    }
}
