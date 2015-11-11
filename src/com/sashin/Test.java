package com.sashin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Test {

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
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (Entry<String,Integer> entry : map.entrySet()) {
			set.add(entry.getValue());
		}
		
		Map<String, Integer> mapOutput = new HashMap<String, Integer>();
		for (Integer integer : set) {
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue()==integer){
					mapOutput.put(entry.getKey(), entry.getValue());
				}
			}
			if (mapOutput.size()>1){
				for(Map.Entry<String, Integer> entry : mapOutput.entrySet()){
					System.out.println(entry.getKey() + "is "+entry.getValue()+" years old");
				}
			}
			mapOutput = new HashMap<String, Integer>();
		}
	}
}


