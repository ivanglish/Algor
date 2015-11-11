package com.atlassian;

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
    		u = function.apply(ts.poll(), u);
    	}
    	return u;
    }
    
    
    
    public static class Function2Impl<T, U, R> implements Function2<T, U, R>{    	
    	@Override
    	public R apply(T t, U u) {
    		System.out.println("value out : "+ t);
    		return null;
    	}
    }
    
    
    
    public static void main(String[] ar){
    	Folder<Integer, Integer> myFolder = new MyFolder<Integer, Integer>();
    	Queue<Integer> queueTs = new LinkedList<Integer>();
    	final Integer ITERATION = 50;
    	for (int i = 0; i < ITERATION; i++) {
    		queueTs.add(i);
		}  	
    	Function2<Integer, Integer, Integer> function2 = new Function2Impl<Integer, Integer, Integer>();   	
    	myFolder.fold(ITERATION, queueTs, function2);
    }  
}
