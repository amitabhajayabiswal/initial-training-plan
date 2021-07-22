package com.perennialsys;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {

    @Test
    public void MergeSort(){
        int[] input = {1,4,2,1,6,0,4};
        MergeSort ms = new MergeSort();
        ms.sort(input, 0, input.length-1);
        ms.printArray(input);
        
    }
}
