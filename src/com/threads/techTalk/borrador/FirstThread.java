package com.threads.techTalk.borrador;

public class FirstThread extends Thread
{

  public void run()
  {
    
     for (int i=1; i<=10; i++)
     {
        System.out.println( "Messag from First Thread : " +i);
    
        try
        {
           Thread.sleep(1000);
        }
        catch (InterruptedException  interruptedException)
        {
          System.out.println(  "First Thread is interrupted when it is  sleeping" +interruptedException);
        }
      }
   }
} 
