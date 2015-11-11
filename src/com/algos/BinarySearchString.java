package com.algos;

import java.util.Arrays;

public class BinarySearchString {
	
	public static void main(String... args) {

	    String words[] = { "abcd", "abcb", "abca", "abcz" };

	    Arrays.sort(words);
	    System.out.println(Arrays.toString(words));
	    {
	        String word = "abcd";
	        search(words, word);
	    }
	    {
	        String word = "abcdd";
	        search(words, word);
	    }
	}

	private static void search(String[] words, String word) {
		int index = Arrays.binarySearch(words, word);
		index = index >= 0 ? index : -1;
		System.out.println(word + " = " + index);
	}

}
