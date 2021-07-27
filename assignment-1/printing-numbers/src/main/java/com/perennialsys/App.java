package com.perennialsys;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int MAX_VALUE = 50;
        PrintValue pv = new PrintValue(MAX_VALUE);
        Thread t1 = new Thread(()->pv.oddValue());
        Thread t2 = new Thread(()->pv.evenValue());
        t1.start();
        t2.start();
    }
}
