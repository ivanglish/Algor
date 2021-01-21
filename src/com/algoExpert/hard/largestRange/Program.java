package com.algoExpert.hard.largestRange;

public class Program {
	  public static int[] largestRange(int[] array) {
			if (array.length==1) return new int[]{ array[0], array[0]};
			int[] salida=new int[2];
			boolean buscaFinal=false;
	    bubbleSort(array);
			for(int i=0; i < array.length; i++){  
				  if (array[i]+1==array[i+1] && !buscaFinal){
						salida[0]=array[i];
						buscaFinal=true;
					}
				  if (array[i]+1!=array[i+1] && buscaFinal){
						salida[1]=array[i];
						return new int[]{ salida[0], salida[1]};
					}
				  if (i==array.length-2) return new int[]{ salida[0], array[array.length-1]};
			}  
	    return new int[] {};
	  }
		
		static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	    }  
	}
