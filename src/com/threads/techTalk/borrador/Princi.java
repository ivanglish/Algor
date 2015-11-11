package com.threads.techTalk.borrador;


public class Princi {
	
	public static void main(String[] args) {
		
        Hilando1 h1 = new Hilando1();
		Hilando2 h2 = new Hilando2();
		
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		t1.setName("1111");
		t2.setName("2222");
		
		t1.start();
		t2.start();
		
	}

}
