package com.perennialsys.model;

public class SavingsAccount extends BankAccount{
    
    private Double interestRate;

    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void desposit(Double amount) {
        if(amount > 0){
            this.balance = this.balance + amount;
        }
    }

    @Override
    public void withdraw(Double amount) {
        if(this.balance - amount < 0){
            System.out.println("Not enough Balance");
        }else{
            this.balance = this.balance - amount;
        }   
    }
}
