package com.threads.techTalk.phaseTwo;

public class Operation {
	
	int val = 0;
	
	public synchronized void add(){		
		while(val<20) {	
			val += 1;
			System.out.println("adding>"+val);
		}
	}
	
	public void watingRoom(){
		System.out.println("#####################################################");
		substract();
	}
	
	public synchronized void substract(){	
		while(val>1){	
			val -= 1;
			System.out.println("substracting>"+val);	
		}
	}
	
	public void watingRoom2(int a){
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		multiply(a);
	}
	
	public synchronized void multiply(int a){		
		System.out.println("multi=====>"+val*a);
	}

}
