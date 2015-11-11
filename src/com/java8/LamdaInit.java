package com.java8;

import java.util.function.Function;

public class LamdaInit {
	
public static void main(String[] args) {
		
		LamdaInit l  = new LamdaInit();
		
		System.out.println(l.atr);
	}
	
	Function<String, String> atr = (name) -> {return "@" + name;};

}
