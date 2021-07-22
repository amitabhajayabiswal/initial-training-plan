package com.perennialsys;

import org.junit.Test;

public class StackTest {

    @Test
    public void voidStackTest(){
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.push(32);
        stack.push(2);
        stack.push(2);
        System.out.println(stack.pop());

    }
}
