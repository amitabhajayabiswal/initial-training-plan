package com.perennialsys;

import com.perennialsys.model.CurrentAccount;
import com.perennialsys.model.SavingsAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SavingsAccount sa = new SavingsAccount(12345, 2);
        sa.desposit(10000.00);
        sa.DisplayBalance();
        CurrentAccount ca = new CurrentAccount(2345, 4);
        ca.desposit(10000.00);
        ca.DisplayBalance();
    }
}
