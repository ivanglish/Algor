package com.threads.techTalk.phaseTwo2;

import java.util.concurrent.Callable;

public class Hilo2 implements Callable<String> {
	
	Operation operation = new Operation();
	
	public Hilo2(Operation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public String call() throws Exception {
		operation.watingRoom();
		return "finishing substracting";
	}
}
