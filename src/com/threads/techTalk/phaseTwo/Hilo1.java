package com.threads.techTalk.phaseTwo;

import java.util.concurrent.Callable;

public class Hilo1 extends HiloMaster implements Callable<String> {

	@Override
	public String call() throws Exception {
		operation.add();
		return "finishing adding";
	}
	
	/*public synchronized void  metodo1(){
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("-->"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}*/

}
