package com.comscore;

public class Test {
	
	public static void main(String[] args) {
		
		
		String bin="101011111010100101010100101010101000100101010010101010010101101101010010101001010101";
		int cont=0;
		int index=bin.length()-1;
		boolean flag=true;
		
		while(index>=0) {
			
			if (bin.charAt(index) == '1' &&  flag) {
				flag=false;
				
			}else {
				
				index--;
				flag=true;
				
			}
			cont++;
			
		}
		System.out.println(cont);
		
	}

}

// 1010 = 