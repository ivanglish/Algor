package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reduce {
	
    public static void main(String[] args) {

	// This is an array.
	int[] array = { 1, 2, 3 };
	// Convert array to a stream.
	IntStream s = Arrays.stream(array);
	// Use reduce to sum all elements in the array.
	int sum = s.reduce(0, (a, b) -> a + b);
	// Display our result.
	System.out.println(sum);
	
	

	s = Arrays.stream(array);
	// Use Integer sum method.
	sum = s.reduce(0, Integer::sum);
	System.out.println(sum);
	
	
    }
}
