package com.threads.techTalk.phaseTwo;

import java.util.concurrent.Callable;

public class Hilo2 extends HiloMaster implements Callable<String> {

	@Override
	public String call() throws Exception {
		operation.watingRoom();
		return "finishing substracting";
	}
	
	
	/*public void watingRoom(){
		System.out.println("#####################################################");
		method2();
	}
	
	public synchronized void method2(){
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("----------->"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}*/
}
