package com.skout_concurrency;

public class Main {
	
	public static void main(String[] args) {
	
		boolean flag=true;
		T1 t1=new T1();
		T2 t2=new T2();
		
		Thread h1=new Thread(t1);
		Thread h2=new Thread(t2);
		
		h1.start();
		h2.start();
		
		while(flag){
			
			if (t1.getScore()>100){
				t2.noty();
				flag=false;
			}
			
		}
		
		
	}
}
