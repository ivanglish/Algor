package com.sashin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

		/**
	* @param args
	*/
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sachin", 30);
		map.put("Bala", 30);
		map.put("Raj", 20);
		map.put("Ivan", 20);
		map.put("Veronica", 18);
		int[] array = new int[150];
		
		Set<Integer> setOutput=new HashSet<Integer>(); 
		for (Entry<String, Integer> entry : map.entrySet()) {
			int i= (Integer)entry.getValue();
			if(array[i]==0){
				array[i]=i;
			}else{
				setOutput.add(i);
			}
		}
		
		for (Integer integer : setOutput) {
			Integer selected = integer;
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue()==selected){
				System.out.println(entry.getKey() + "is "+entry.getValue()+" years old");
				}
			}
		}
	} 
}
