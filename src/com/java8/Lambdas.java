package com.java8;

import java.util.function.Function;

public class Lambdas {
	
	
	public static void main(String[] args) {
		
		Lambdas l  = new Lambdas();
		
		System.out.println(l.atr);
	}
	
	Function<String, String> atr = (name) -> {return "@" + name;};

}
