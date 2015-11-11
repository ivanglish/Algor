package com.threads;


public class Letras extends MisThreads implements Runnable, IThreadsSource {
	
	String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
			"K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };

	@Override
	public synchronized void run() {
		
	    for (int i = 0; i < 100; i++) {
	            int numRandon = (int) Math.round(Math.random() * 25 ) ;
	            System.out.println(abecedario[numRandon]);
                    nextCharacter(abecedario[numRandon].charAt(0));
            /* if (abecedario[numRandon].charAt(0) == 'K'){
                        System.out.println("xxxxxxxxxxxxxxxxxxx");
                        this.notify();
                    } */

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
		
	}
}
