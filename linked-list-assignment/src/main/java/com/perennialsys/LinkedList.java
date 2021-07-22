package com.perennialsys;

//http://users.csc.calpoly.edu/~jdalbey/102/Labs/removeA.html
public class LinkedList {

    LinkedListNode head=null, tail=null, p=null;

    public LinkedListNode insert(Character element){
        p = createNode(element);
        if(head == null){
            head = tail = p;
        }
        else{
            tail.setNext(p);
            tail = tail.getNext();
        }
        return head;
    }

    public LinkedListNode createNode(Character element){
        return new LinkedListNode(element);
    }
    
    public void removeLetter(){
        
        LinkedListNode temp = head, prev=null;

        //Removing initial letters A
        while(temp != null && temp.getKey() == 'A'){

            temp = temp.getNext();
            head = temp;
            //prev.setNext(null);
        }
        
        while(temp != null){

            while(temp!= null && temp.getKey() != 'A'){
                prev = temp;
                temp = temp.getNext();
            }
            if(temp == null){
                return;
            }
            prev.setNext(temp.getNext());
            temp = prev.getNext();
        }
    }

    public void printList(){
        while(head != null){
            System.out.println(head.getKey());
            head = head.getNext();
        }
    }
}
