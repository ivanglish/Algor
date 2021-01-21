package com.algoExpert.middle.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Program {

	  public static List<List<String>> groupAnagrams(List<String> words) {
		Map<String, List<String>> map= new HashMap<String, List<String>>();
	    for (int i = 0; i < words.size(); i++) {
	    	char charArray[] = words.get(i).toCharArray();
	    	Arrays.sort(charArray);
	    	String s=new String(charArray);
				if (map.containsKey(s)) {
					map.get(s).add(words.get(i));
				}else {
					map.put(s, new ArrayList<>(Arrays.asList(words.get(i))));
				}
			}
	    return new ArrayList<>(map.values());
	  }
}
