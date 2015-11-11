package com.java8;

import java.util.Arrays;
import java.util.List;

public class LamdaExamples {
	
	public static void main(String[] args) {
		
		//Old way:
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for(Integer n: list) {
		    System.out.println(n);
		}
		 
		//New way:
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list2.forEach(n -> System.out.println(n));
		 
		 
		//or we can use :: double colon operator in Java 8
		list2.forEach(System.out::println);
		
		
		
		
		
		//Old way:
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6,7);
		for(Integer n : list3) {
		    int x = n * n;
		    System.out.println(x);
		}
		 
		//New way:
		List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7);
		list4.stream().map((x) -> x*x).forEach(System.out::println);
		
		
		
		
		
		
		
		//Old way:
		List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7);
		int sum = 0;
		for(Integer n : list5) {
		    int x = n * n;
		    sum = sum + x;
		}
		System.out.println(sum);
		 
		//New way:
		List<Integer> list6 = Arrays.asList(1,2,3,4,5,6,7);
		int sum2 = list6.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		System.out.println(sum2);
		
	}
	
	

}
