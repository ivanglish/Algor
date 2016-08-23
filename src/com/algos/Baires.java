package com.algos;

public class Baires {

	private Baires() {
	}


	public static void main(String[] args) {
		System.out.println(Baires.isCasiPalindromo("abax"));
	}
	
	
	public static boolean isCasiPalindromo(String palabra){
		
		boolean exit=true; 
		
		char[] pala1 = palabra.toCharArray();
		char[] pala2 = palabra.toCharArray();
		
		int j=0;
		int count=0;
		for (int i = pala1.length; i < 0; i++) {
			if (pala1[i]!=pala2[j]) {
				count++;
			}
			j++;
		}
		
		if (count>1) exit=false;
		return exit;
	}

}


//public static int numeroPopular(int n, int[] array)
//{
//int num = 0;
//int veces [ ] = new int [array.length];
//int posicion = 0;
//for(int i = 0; i < array.length; i++){
//  num = array[i];
//  for(int j = i; j < array.length; j++){
//     if(array[j] == num){
//        veces[i]++; 
//     }
//  }
//}
//num = 0;
//
//for(int k = 0; k < veces.length; k++){
//   if(num < veces [k]){
//     num = veces [k];
//     posicion = k;
//   }
//}
//return array[posicion];
//}