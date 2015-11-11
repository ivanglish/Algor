package com.threads.techTalk.phaseTwo2;

import java.util.concurrent.Callable;

public class Hilo3 implements Callable<String> {
	
	Operation operation = new Operation();
	

	public Hilo3(Operation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public String call() throws Exception {
		operation.watingRoom2(20);
		return "finishing multilying";
	}

}
