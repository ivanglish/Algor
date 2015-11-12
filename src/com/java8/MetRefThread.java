package com.java8;

public class MetRefThread {

	public static void runBody() {
		for (int i = 0; i < 10; i++) {
			System.out.println("square of i is " + (i * i));
		}
	}

	public static void main(String[] args) {
		new Thread(MetRefThread::runBody).start();
	}

}
