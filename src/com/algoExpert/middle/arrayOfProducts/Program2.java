package com.algoExpert.middle.arrayOfProducts;

//time = O(N) , space = O(N) con division
class Program2 {
	public int[] arrayOfProducts(int[] array) {
	  int multi=1;
	  for (int i=0;i<array.length;i++){
				multi*=array[i];
			}
	  for (int i=0;i<array.length;i++){
				array[i]=multi/array[i];
			}
	  return array;
	}
}