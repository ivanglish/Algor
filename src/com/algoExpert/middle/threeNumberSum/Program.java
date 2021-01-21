package com.algoExpert.middle.threeNumberSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
	  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
			int right, left, suma;
			Arrays.sort(array);
			List<Integer[]> resp=new ArrayList<>(); 
	    for (int i=0;i<array.length;i++){
				right=i+1;
				left=array.length-1;
				while(right<left) {
					suma=array[i]+array[right]+array[left];
					if (suma==targetSum) {
						resp.add (new Integer[] {array[i],array[right], array[left]});
						right++;
						left--;
						if (left==array.length) break;
					}else if (suma>targetSum)	left--;
					else right++;
				}
			}
	    return resp;
	  }
}