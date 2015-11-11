package com.sashin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test3 {
	
	public static void main(String[] args) {
		
		List<Integer> lista= new ArrayList<Integer>();
		lista.add(30);
		lista.add(20);
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(20);
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> setOut = new HashSet<Integer>();
		
		for (Integer thisEntry : lista) {
			if (!set.add(thisEntry)){
				setOut.add(thisEntry);
			}
			
		}
		
		//display the result
		for (Integer integer : setOut) {
			System.out.println(integer);
		}
	}
}
