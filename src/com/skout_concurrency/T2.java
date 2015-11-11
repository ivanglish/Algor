package com.skout_concurrency;

public class T2 extends Base implements Runnable {

	boolean done2=true;
	@Override
	public synchronized void run() {

		while(done2){
			score--;
			System.out.println("res>"+score);
			try {
				Thread.sleep(100);
				if (getScore()==50){	
					this.wait();
				}
				if (getScore()>150){
					done2=false;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public synchronized void noty(){
		
		this.notify();
	}

}
