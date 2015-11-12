package com.java8;

import java.util.function.Supplier;

public class MethodReferences {
	
	public void example() {
	    String x = "hello";
	    function(x::toString);
	}
	
	public static String function(Supplier<String> supplier) {
	    return supplier.get();
	}

}
