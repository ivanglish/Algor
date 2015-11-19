package com.java8.interfacesWithCode;

public interface NewInterface {

	default String entrada() {

		return "retorno";
	}

	default String salida() {

		return "salida";
	}

	static String echoMyName() {
		return "ivan";
	}
}
