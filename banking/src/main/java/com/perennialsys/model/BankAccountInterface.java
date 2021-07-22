package com.perennialsys.model;

public interface BankAccountInterface {
    public int getAccountNumber();
    public abstract void desposit(Double amount);
    public abstract void withdraw(Double amount);
}
