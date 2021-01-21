package com.algoExpert.middle.smallestDiference;

import java.util.*;

public class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int indexOne=0;
		int indexTwo=0;
		int [] resp=new int[2];
		int min=Integer.MAX_VALUE;
		while (indexOne<arrayOne.length && indexTwo<arrayTwo.length){
			if (arrayOne[indexOne]==arrayTwo[indexTwo]) return new int[]{arrayOne[indexOne], arrayTwo[indexTwo]};
			else if (arrayOne[indexOne]<arrayTwo[indexTwo]){
				if ((arrayTwo[indexTwo] - arrayOne[indexOne])<min){
					min= arrayTwo[indexTwo] - arrayOne[indexOne];
					resp[0]=arrayOne[indexOne];
					resp[1]=arrayTwo[indexTwo];
				}
				indexOne++;
			}else if (arrayOne[indexOne]>arrayTwo[indexTwo]){
				if ((arrayOne[indexOne]-arrayTwo[indexTwo])<min){
					min=arrayOne[indexOne]-arrayTwo[indexTwo];
					resp[0]=arrayOne[indexOne];
					resp[1]=arrayTwo[indexTwo];	
				}
				indexTwo++;
			}
		}
		System.out.println(resp[0]+","+resp[1]);
    return resp;
  }
}