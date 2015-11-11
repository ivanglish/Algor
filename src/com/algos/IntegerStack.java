package com.algos;

import java.util.Arrays;

public class IntegerStack 
{

    private int stack [];
    private int top; 

    public IntegerStack(int SIZE) 
   {
    	stack = new int [SIZE];
    	top = 0;
    }

	public void push(int i) 
	{
	    if (top == stack.length)
	    {
	        extendStack();
	    }
	
	       stack[top]= i;
	       top++;
	}
	
	public int pop() 
	{ 
	      if(!isEmpty()){
		      int value= stack[top-1];
		       top --;
		       return value; 
	      } else{
	    	  return -1;// OR invalid value
	      }

	}
	
	public int peek()
	{
	       if(!isEmpty()){
	         return stack[top-1];
	       }else{
	         return -1;// Or any invalid value
	       }
	}
	
	
	public boolean isEmpty() 
	{
	    if ( top == 0)
	    {
	        return true;
	    }else{
	    	return false;
	    }
	}
	
	private void extendStack()
	{  
	    stack=Arrays.copyOf(stack, stack.length+1); 
	}
}
