package com.algoExpert.hard.longestSubstringNoDupl;

import java.util.HashMap;
import java.util.Map;

class Program {
	public static String longestSubstringWithoutDuplication(String str) {
		Map<Character, Integer> map=new HashMap<>(); 
		String salida="", aux="";
		int index=0;
		for (int i = 0; i < str.length(); i++) {
			Character letra=str.charAt(i);
			if(map.containsKey(letra)) {
				if (index<map.get(letra))index=map.get(letra)+1;	
				else aux=str.substring(index,i+1);
				map.put(letra, i);				
				if (aux.length()>salida.length()) {
					if (aux.contains(letra.toString())) salida=aux;
					else salida=aux+letra;
					aux="";
				}
			}else {
				map.put(letra, i);
				aux=str.substring(index,i+1);
			}
		}
		if (salida.isEmpty()) return aux;
		return salida;
	}
}