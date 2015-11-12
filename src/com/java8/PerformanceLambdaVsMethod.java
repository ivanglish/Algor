package com.java8;

import java.util.function.Function;

public class PerformanceLambdaVsMethod {

	public static void main(String[] args) {

		Function<Integer, Integer> function = element -> element + 1;

		long t1 = System.currentTimeMillis();

		// Version 1: apply a function specified as a lambda expression.
		for (int i = 0; i < 10000000; i++) {
			int result = function.apply(i);
			if (result == -1) {
				System.out.println(false);
			}
		}

		long t2 = System.currentTimeMillis();

		// Version 2: call a static method.
		for (int i = 0; i < 10000000; i++) {
			int result = method(i);
			if (result == -1) {
				System.out.println(false);
			}
		}

		long t3 = System.currentTimeMillis();

		// ... Benchmark results.
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
	}
	
	public static int method(int element) {
		return element + 1;
	}


}
