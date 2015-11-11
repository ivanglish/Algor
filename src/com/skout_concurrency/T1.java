package com.skout_concurrency;

public class T1 extends Base implements Runnable {
	
	boolean done=true;

	@Override
	public void run() {
		while(done){
			
			score++;
			score++;
			System.out.println("sum>"+score);
			try {
				Thread.sleep(100);
				if (getScore()>150){
					done=false;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}	
}
