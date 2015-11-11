package com.sashin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test4 {
	
	public static void main(String[] args) {
		
		int[] array = new int[150];
		List<Integer> lista= new ArrayList<Integer>();
		lista.add(30);
		lista.add(20);
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(20);
		
		Set<Integer> setOutput=new HashSet<Integer>();
		for (Integer integer : lista) {
			int i= integer.intValue();
			if(array[i]==0){
				array[i]=i;
			}else{
				setOutput.add(i);
			}
		}

		//display the results
		for (Integer integer : setOutput) {
			System.out.println(integer);
		}
	}
}
