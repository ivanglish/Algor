package com.algoExpert.middle.monothonicArray;

class Program {

	static char direccion = 0;
	static int aux;

	public static boolean isMonotonic(int[] array) {
		if (array.length == 0 || array.length == 1) return true;
		define(array[0], array[1]);
		for (int i = 0; i < array.length; i++) {
			if (direccion == 'a') {
				if (array[i] >= aux)
					aux = array[i];
				else
					return false;
			} else if (direccion == 'd') {
				if (array[i] <= aux)
					aux = array[i];
				else
					return false;
			} else {
				if (i == array.length - 1) return true;
				define(array[i], array[i+1]);
			}
		}
		return true;
	}
	
	public static void define(int uno, int dos) {
		if (uno < dos) {
			direccion = 'a';
			aux = Integer.MIN_VALUE;
		} else if (uno > dos){
			direccion = 'd';
			aux = Integer.MAX_VALUE;
		}else direccion = 'n';
	}
}
