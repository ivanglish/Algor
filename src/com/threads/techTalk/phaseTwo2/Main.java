package com.threads.techTalk.phaseTwo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Operation operation = new Operation();

        Hilo1 h1 = new Hilo1(operation);
		Hilo2 h2 = new Hilo2(operation);
		Hilo3 h3 = new Hilo3(operation);
		
		Future<String> future1 = executor.submit(h1);
		Future<String> future2 = executor.submit(h2);
		Future<String> future3 = executor.submit(h3);
		
		try {
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally{
			executor.shutdown();
		}
	}
}
