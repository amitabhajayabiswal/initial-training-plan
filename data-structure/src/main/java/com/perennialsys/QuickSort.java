package com.perennialsys;

public class QuickSort {
    
    public void swap(int left, int right){
        int temp = left;
        left = right;
        right = temp;
    }

    public void sort(int[] arr, int low, int high){
        if(low < high){
            int partitionIndex = partition(arr, low, high);
            sort(arr, low, partitionIndex-1);
            sort(arr, partitionIndex+1, high);
        }
    }

    public int partition(int[] arrayElements, int low, int high){
        int pivot = arrayElements[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(pivot >= arrayElements[j]){
                i++;
                swap(i, j);
            }
        }
        swap(i+1, high);
        return i+1;
    }

    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
