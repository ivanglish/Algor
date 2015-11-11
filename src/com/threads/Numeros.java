package com.threads;

public class Numeros extends MisThreads implements Runnable, IThreadsSource {

    private boolean done = true;
    
    
	@Override
	public synchronized void run() {
	  int i=0;		
	   while(i < 100) {
                    int j= (int)Math.round(Math.random() * 25 );
	            System.out.println(j);
                    nextCharacter(String.valueOf(j).charAt(0));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            if (j==7){
                try {
                    System.out.println("numeros sleeeeeeeeeeeeeeeeeeeeeping");
                    this.wait(10000);
                    System.out.println("despertandoooooooo");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           }
            i++;
	    }
	}
        
        public synchronized void setDone(boolean b) {
            done = b;
    
            if (!done)
                notify();
        }
}
