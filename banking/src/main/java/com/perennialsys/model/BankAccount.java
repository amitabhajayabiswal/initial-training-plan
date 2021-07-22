package com.perennialsys.model;

public abstract class BankAccount implements BankAccountInterface{

    private int accountNumber;
    protected Double balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0D;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public abstract void desposit(Double amount);
    public abstract void withdraw(Double amount);

    public void DisplayBalance(){
        System.out.println("Current balance" + this.balance);
    }
}
