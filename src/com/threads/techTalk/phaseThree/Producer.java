package com.threads.techTalk.phaseThree;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    private final BlockingQueue<Integer> sharedQueue;
    
    public Producer(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                System.out.println("Produced: " + i);
                sharedQueue.put(i);
            } catch (InterruptedException ex) {
            	ex.printStackTrace();
            }
        }
    }

}



