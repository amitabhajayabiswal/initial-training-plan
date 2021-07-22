package com.perennialsys;

public class Queue {
    //final int MAX = 1000;
    int[] queueArray;
    int front, rear;
    private int size;

    public Queue(int size){
        queueArray = new int[size];
        front = rear = -1;
    }

    public void enQueue(int x)
    {
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1)))
        {
            System.out.print("Queue is Full");
        }
        else if(front == -1)
        {
            front = 0;
            rear = 0;
            queueArray[rear] = x;
        }
        else if(rear == size - 1 && front != 0)
        {
            rear = 0;
            queueArray[rear] = x;
        }
        else
        {
            rear = rear + 1;
            if(front <= rear)
            {
                queueArray[rear] = x;
            }
        }
    }

    public boolean deQueue(){
        if(front == 1 && rear == size){
            System.out.println("Out of memory");
            return false;
        }
        else{
            front++;
            return true;
        }
    }

    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(rear == size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int peek(){
        return queueArray[front];
    }
}
