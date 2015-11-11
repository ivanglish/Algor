package com.algos;

public class LocalVarTest {

	int count = 5;
	
	public void function(){
		if (true){
			int count = 50;
			System.out.println(count);
		}
		count = count + 5;
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		LocalVarTest lvt = new LocalVarTest();
		lvt.function();

	}

}
