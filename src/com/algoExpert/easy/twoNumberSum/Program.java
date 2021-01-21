package com.algoExpert.easy.twoNumberSum;

import java.util.HashMap;
import java.util.Map;

public class Program {
	  public static int[] twoNumberSum(int[] array, int targetSum) {
			Map<Integer,Integer> map=new HashMap<>();
			int[] out= new int[2];
	    for (int i=0;i<array.length;i++){
				if (map.get(targetSum-array[i])!=null) return new int []{map.get(targetSum-array[i]), array[i]};
				map.put(array[i], array[i]);
			}
	    return new int[0];
	  }
}
