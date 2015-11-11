package com.threads.techTalk.phaseTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
        
        //Create MyCallable instance
        Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Hilo3 h3 = new Hilo3();
		
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
