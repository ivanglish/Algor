package com.algoExpert.middle.arrayOfProducts;

import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
   int [] resp=new int[array.length];
		int indexRight, indexLeft, multi=1;
    for(int i=0;i<array.length;i++){
			indexRight=i+1;
			indexLeft=i-1;
			while(indexRight<array.length){
				multi*=array[indexRight];
				indexRight++;
			}
			while(indexLeft>=0){
				multi*=array[indexLeft];
				indexLeft--;
			}
			resp[i]=multi;
			multi=1;
		}
    System.out.println(Arrays.toString(resp));
    return resp;
  }
}

