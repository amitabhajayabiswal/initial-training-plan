package com.perennialsys;

import org.junit.Test;

public class BinaryHeapTest {

    @Test
    public void BinaryHeapExtractTest(){
        BinaryHeap bHeap = new BinaryHeap();
        bHeap.insert(19);
        bHeap.insert(15);
        bHeap.insert(12);
        bHeap.insert(17);
        bHeap.insert(17);
        System.out.println(bHeap.extractMin());
        System.out.println(bHeap.extractMin());
        System.out.println(bHeap.extractMin());
        System.out.println(bHeap.extractMin());
    }
}
