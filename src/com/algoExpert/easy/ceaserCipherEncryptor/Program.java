package com.algoExpert.easy.ceaserCipherEncryptor;

public class Program {
	  public static String caesarCypherEncryptor(String str, int key) {
			StringBuilder salida=new StringBuilder();
			
			str.chars().forEach(c -> {
				  int value=c+(key%26); //key mod 26 para evitar las vueltas como 54 26+26+2
				  if (value>122) value-=26;
				  salida.append((char)value);
				});

	    return salida.toString();
	  }
	}

