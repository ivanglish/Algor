package com.threads.techTalk.phaseTwo2;

import java.util.concurrent.Callable;

public class Hilo1 implements Callable<String> {
	
	Operation operation = new Operation();
	
	public Hilo1(Operation operation) {
		super();
		this.operation = operation;
	}


	@Override
	public String call() throws Exception {
		operation.add();
		return "finishing adding";
	}
}
