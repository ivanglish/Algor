package com.threads.techTalk.phaseOne;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.threads.techTalk.phaseOne.helpers.FibonacciThread;
import com.threads.techTalk.phaseOne.helpers.SortingThread;
import com.threads.techTalk.phaseOne.helpers.TextReader;
import com.threads.techTalk.utils.CreatePDF;

public class Main {
	
public static void main(String[] args) {
		
		int threads = 3;
		ExecutorService executor = Executors.newFixedThreadPool(threads);	
		
        SortingThread st = new SortingThread();
        TextReader tr = new TextReader();
        FibonacciThread ft = new FibonacciThread();
	
		Future<int[]> future1 = executor.submit(st);
		Future<List<String>> future2 = executor.submit(tr);
		Future<int[]>future3 = executor.submit(ft);
			
		try {
			CreatePDF.setPDF(future1.get(), future2.get(), future3.get());
		} catch (InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		}
		executor.shutdown();
	}
}
