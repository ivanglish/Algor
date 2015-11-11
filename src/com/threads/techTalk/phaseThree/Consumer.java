package com.threads.techTalk.phaseThree;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable{

    private final BlockingQueue<Integer> sharedQueue;

    public Consumer (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
  
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed: "+ sharedQueue.take());
            } catch (InterruptedException ex) {
            	ex.printStackTrace();
            }
        }
    }  
}


