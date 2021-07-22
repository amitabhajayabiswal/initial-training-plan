package com.perennialsys;

public class MergeSort {
    
    public void sort(int arrayElements[], int leftIndex, int rightIndex){
        //to check if there are more than one element in array
        
        if(leftIndex < rightIndex){
            int middleIndex = (leftIndex + rightIndex)/2;
            sort(arrayElements, leftIndex, middleIndex);
            sort(arrayElements, middleIndex+1, rightIndex);
            merge(arrayElements, leftIndex, rightIndex, middleIndex);
        }
    }

    public void merge(int[] arrayElements, int leftIndex, int rightIndex, int middleIndex){
        
        int leftSubArraySize = middleIndex - leftIndex + 1;
        int rightSubArraySize = (rightIndex - middleIndex);

        int[] leftSubArray = new int[leftSubArraySize];
        int[] rightSubArray = new int[rightSubArraySize];
        
        for (int i = 0; i < leftSubArray.length; i++)
            leftSubArray[i] = arrayElements[leftIndex + i];
        for (int i = 0; i < rightSubArray.length; i++)
            rightSubArray[i] = arrayElements[middleIndex+ i + 1];
        
        
        int leftSubArrayIndex=0, rightSubArrayIndex=0;

        for(int i=leftIndex ; i<rightIndex+1; i++){
            if(leftSubArrayIndex < leftSubArray.length && rightSubArrayIndex < rightSubArray.length){
                if(leftSubArray[leftSubArrayIndex] < rightSubArray[rightSubArrayIndex])
                {
                    arrayElements[i] = leftSubArray[leftSubArrayIndex];
                    leftSubArrayIndex++;
                }
                else
                {
                    arrayElements[i] = rightSubArray[rightSubArrayIndex];
                    rightSubArrayIndex++;
                }
            }
            //If right subarray element is finished
            else if(leftSubArrayIndex < leftSubArray.length)
            {
                arrayElements[i] = leftSubArray[leftSubArrayIndex];
                leftSubArrayIndex++;
            }
            else if(rightSubArrayIndex < rightSubArray.length)
            {
                arrayElements[i] = rightSubArray[rightSubArrayIndex];
                rightSubArrayIndex++;
            }
        }
    }
    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
