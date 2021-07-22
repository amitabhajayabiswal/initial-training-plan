package com.perennialsys;

public class LinkedListNode {
    Character key;
    LinkedListNode next;
    public LinkedListNode(){

    }
    public LinkedListNode(Character element){
        key = element;
        next = null;
    }
    public Character getKey() {
        return key;
    }
    public void setKey(Character key) {
        this.key = key;
    }
    public LinkedListNode getNext() {
        return next;
    }
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
