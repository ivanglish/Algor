package com.threads.techTalk.phaseOne.helpers;

import java.util.Random;
import java.util.concurrent.Callable;

public class SortingThread implements Callable<int[]>{
    
    private int array[];
    private int length;
    private int[] input;  
    
    public SortingThread() {
       Random rand = new Random();
       input = new int[1000];
       for (int i = 0; i <1000 ; i++) {
       		input[i]= rand.nextInt(1000) + 1;
       }
	}
    
    @Override
	public int[] call() throws Exception {
		 sort(input);
		 for(int i:input){
	            System.out.println("--->"+i);
	        }
		return input;
	}

	public void sort(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
    
    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

