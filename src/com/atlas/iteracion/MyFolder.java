package com.atlas.iteracion;

import java.util.LinkedList;
import java.util.Queue;

public class MyFolder<T, U> implements Folder<T, U>
{
    public U fold(U u, Queue<T> ts, Function2<T, U, U> function)
    {
        if(u == null || ts == null || function == null)
            throw new IllegalArgumentException();
              
        while(!ts.isEmpty()){
            System.out.println("data: "+ ts.toString());
            System.out.println(function.apply(ts.poll(), u));
       }
        return u;
    }
   
    
    public static class Function2Impl<T, U, R> implements Function2<T, U, R>{       
        @Override
        public R apply(T t, U u) {
            return (R) ("value : "+ t +" of "+u) ;
        }
    }
   
   
    public static void main(String[] ar){
        Folder<Integer, String> myFolder = new MyFolder<Integer, String>();
        Queue<Integer> queueTs = new LinkedList<Integer>();
        final Integer ITERATION = 50;
        for (int i = 0; i < ITERATION; i++) {
            queueTs.add(i);
        }     
        Function2<Integer, String, String> function2 = new Function2Impl<Integer, String, String>();      
        System.out.println(myFolder.fold(ITERATION.toString(), queueTs, function2)+ " values gone!!");
    } 
}