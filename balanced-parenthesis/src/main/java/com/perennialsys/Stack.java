package com.perennialsys;

public class Stack {

    final int MAX = 1000;
    int top = 0;
    char[] stackArray = new char[MAX];

    public boolean push(char x){
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            stackArray[++top] = x;
            return true;
        }
    }
    public char pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = stackArray[top--];
            return x;
        }
    }
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
