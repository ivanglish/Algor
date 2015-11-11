package com.threads.techTalk.borrador;

public class Compartido {
	
	public synchronized void  metodo1(){
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("-->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void watingRoom(){
		System.out.println("#####################################################");
		method2();
	}
	
	public synchronized void method2(){
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("----------->"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
