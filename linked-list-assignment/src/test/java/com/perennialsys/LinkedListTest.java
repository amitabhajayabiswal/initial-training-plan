package com.perennialsys;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void LinkedListStartingWithATest(){
        LinkedList ll = new LinkedList();
        ll.insert('A');
        ll.insert('B');
        ll.insert('D');
        ll.insert('C');
        ll.insert('F');
        ll.removeLetter();
        ll.printList();
    }
    @Test
    public void LinkedListEndingWithATest(){
        LinkedList ll = new LinkedList();
        ll.insert('B');
        ll.insert('D');
        ll.insert('C');
        ll.insert('F');
        ll.insert('A');
        ll.removeLetter();
        ll.printList();
    }

    @Test
    public void nullListTest(){
        LinkedList ll = new LinkedList();
        ll.removeLetter();
    }

    @Test
    public void LinkedListStartingWithMultipleATest(){
        LinkedList ll = new LinkedList();
        ll.insert('A');
        ll.insert('A');
        ll.insert('A');
        ll.insert('B');
        ll.insert('D');
        ll.insert('C');
        ll.insert('F');
        ll.removeLetter();
        ll.printList();
    }

    @Test
    public void LinkedListEndingWithMultipleATest(){
        LinkedList ll = new LinkedList();
        ll.insert('B');
        ll.insert('D');
        ll.insert('C');
        ll.insert('F');
        ll.insert('A');
        ll.insert('A');
        ll.insert('A');
        ll.removeLetter();
        ll.printList();
    }

    @Test
    public void LinkedListWithSingleATest(){
        LinkedList ll = new LinkedList();
        ll.insert('A');
        ll.removeLetter();
        ll.printList();
    }
    @Test
    public void LinkedListWithMultipleATest(){
        LinkedList ll = new LinkedList();
        ll.insert('A');
        ll.insert('A');
        ll.insert('A');
        ll.removeLetter();
        ll.printList();
    }

    @Test
    public void LinkedListWithNoA(){
        LinkedList ll = new LinkedList();
        ll.insert('B');
        ll.insert('D');
        ll.insert('C');
        ll.insert('F');
        ll.printList();
    }

}
