package com.perennialsys;

public class Stack {

    final int MAX = 1000;
    int top = 0;
    int[] stackArray = new int[MAX];

    public boolean push(int x){
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            stackArray[++top] = x;
            return true;
        }
    }
    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = stackArray[top--];
            return x;
        }
    }
}
