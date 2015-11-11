package com.threads.techTalk.phaseTwo;

import java.util.concurrent.Callable;

public class Hilo3 extends HiloMaster implements Callable<String> {

	@Override
	public String call() throws Exception {
		operation.watingRoom2(20);
		return "finishing multilying";
	}

}
