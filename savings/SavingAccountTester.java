package com.xworkz.savings;

import com.xworkz.bankaccount.SavingAccount;

public class SavingAccountTester {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        System.out.println("check balance before credit" + savingAccount.getBalance());
        savingAccount.creadit(5000.80);
        double total = savingAccount.getBalance();
        savingAccount.debit(2000);
        double balance = savingAccount.getBalance();
        System.out.println("check balance after" + savingAccount.getBalance());

        SavingAccount shwetaAccount=new SavingAccount();
        shwetaAccount.creadit(50000);
        System.out.println("current account" +shwetaAccount.getBalance());


        SavingAccount friendAccount=new SavingAccount();

        shwetaAccount.transfer(friendAccount,2000);

        System.out.println("current balance of shweta"+ shwetaAccount.getBalance());
        System.out.println("current balance of friend"+ friendAccount.getBalance());



        SavingAccount friendAccount1=new SavingAccount();

        shwetaAccount.transfer(friendAccount1,10000);

        System.out.println("current balance of shweta"+ shwetaAccount.getBalance());
        System.out.println("current balance of friend"+ friendAccount1.getBalance());

        SavingAccount friendAccount2=new SavingAccount();

        shwetaAccount.transfer(friendAccount2,5000);

        System.out.println("current balance of shweta"+ shwetaAccount.getBalance());
        System.out.println("current balance of friend"+ friendAccount2.getBalance());

        SavingAccount friendAccount3=new SavingAccount();
        shwetaAccount.transfer(friendAccount3,10000);

        System.out.println("current balance of shweta"+ shwetaAccount.getBalance());
        System.out.println("current balance of friend"+ friendAccount3.getBalance());

        SavingAccount max=new SavingAccount();
        shwetaAccount.transfer(max,10000);

        System.out.println("current balance of shweta"+ shwetaAccount.getBalance());
        System.out.println("current balance of max"+ max.getBalance());


    }
}
