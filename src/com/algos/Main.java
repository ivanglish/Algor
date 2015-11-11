package com.algos;

public class Main {
	
	public static void main(String[] args) {
		
		
		IntegerStack is= new IntegerStack(4);
		is.push(4);
		is.push(8);
		is.push(9);
		is.push(2);
		is.push(11);
		is.push(7);
		is.push(6);
		
		
		System.out.println(is.pop());
		System.out.println(is.peek());
	}

}
