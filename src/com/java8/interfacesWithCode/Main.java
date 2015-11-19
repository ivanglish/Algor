package com.java8.interfacesWithCode;

public class Main {

	public static void main(String[] args) {
		
		
		NewInterfaceImpl ni= new NewInterfaceImpl();
		System.out.println(ni.entrada());
		System.out.println(ni.imprime()); // no definido a traves de la interface
		System.out.println(ni.salida());
		
		
		
		NewInterface ni2 = new NewInterfaceImpl();
		System.out.println(ni2.entrada());
		System.out.println(ni2.salida());
		System.out.println(NewInterface.echoMyName()); // metodo estatico implementado en la interface

	}

}
