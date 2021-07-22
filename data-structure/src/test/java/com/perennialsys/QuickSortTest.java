package com.perennialsys;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] arrayElements = {10,9,8,7,6,5,4};
        QuickSort qs = new QuickSort();
        qs.sort(arrayElements,0,arrayElements.length-1);
        qs.printArray(arrayElements);
    }
}
