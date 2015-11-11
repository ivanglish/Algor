package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_collision_test {
	
	
	public static void main(String[] args) {
		
		Map<String,String> MyHashMap = new HashMap<String,String>();		
		MyHashMap.put("key1", "value1");  
		MyHashMap.put("key1", "value2"); 
		MyHashMap.put("key2", "value3");
		
		System.out.println(MyHashMap.size());
		System.out.println(MyHashMap.get("key1"));
		
	}
	

}
