package com.enum_ex;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Currency.PENNY.getValue());
		Currency c = Currency.PENNY;
		System.out.println(c);
		System.out.println(c.getValue());

	}

}
