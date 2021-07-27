package com.perennialsys;

public class PrintValue {

    volatile boolean isOdd = true;
    static volatile int num = 0;
    final int MAX_VALUE;

    PrintValue(int max_value){
        MAX_VALUE = max_value;      
    }

    public void oddValue(){
        synchronized(this){
            while(num <= MAX_VALUE){
                if(num % 2 ==0){
                    try{
                        wait();
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(num++);
                //isOdd=false;
                notify();
            }
        }
    }

    public void evenValue(){
        synchronized(this){
            while(num <= MAX_VALUE){
                if(num % 2 == 1){
                    try{
                        wait();
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(num++);
                isOdd=true;
                notify();
            }
            
        }
    }
}
