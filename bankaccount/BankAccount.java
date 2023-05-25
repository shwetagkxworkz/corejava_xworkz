package com.xworkz.bankaccount;
//base,super,parent class
public class BankAccount {
    private double balance;
    public void creadit(double ammount){
        balance=balance+ammount;
    }

    public void debit(double ammount){
        balance=balance-ammount;
    }
    public double getBalance(){
        return balance;
    }
    public void transfer(BankAccount shwetaAccount, double ammount){
        shwetaAccount.creadit(ammount);
        this.debit(ammount);
    }
}
