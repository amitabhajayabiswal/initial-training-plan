package com.perennialsys.model;

public class CurrentAccount extends BankAccount{

    private static double FEE = 2.5;
    
    public CurrentAccount(int accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(int accountNumber, double fee) {
        super(accountNumber);
        FEE = fee;
    }

    @Override
    public void desposit(Double amount) {
        if(amount > 0){
            this.balance = this.balance + amount;
            System.out.println("Amount after deposit " + this.balance);
            this.balance = this.balance - FEE;
            System.out.println("Amount after fee deduction " + this.balance);
        }
        else{
            System.out.println("A negative amount cannot be deposited");
        }      
    }

    @Override
    public void withdraw(Double amount) {
        if(amount > 0){
            if(this.balance-amount > 0){
                this.balance = this.balance - amount;
                System.out.println("Amount after deposit " + this.balance);
                this.balance = this.balance - FEE;
                System.out.println("Amount after fee deduction " + this.balance);
            }
            else{
                System.out.println("Negative balance not allowed");
            }
        }
        
    }
    
}
