package com.threads.techTalk.phaseOne.helpers;

import java.util.concurrent.Callable;

public class FibonacciThread implements Callable<int[]>{
	
	@Override
	public int[] call() throws Exception {
		int number = 40;
		int arr[] = new int[41];
		for (int i = 1; i <= number; i++) {
			arr[i]= fibonacciRecusion(i);
			System.out.print("F>"+arr[i] + " ");
		}
		return arr;
	}

	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2);
	}

	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci;
	}
}
