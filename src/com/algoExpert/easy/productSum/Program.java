package com.algoExpert.easy.productSum;

import java.util.ArrayList;
import java.util.List;

public class Program {
	  // Tip: You can use `element instanceof ArrayList` to check whether an item
	  // is an array or an integer.
			
	  public static int productSum(List<Object> array) {
	    return productSumHelper(array, 1);
	  }
		
		public static int productSumHelper(List<Object> array , int factor){
			 int suma=0;
			 for(Object ob: array){
				if (ob instanceof ArrayList){
					@SuppressWarnings("unchecked")
					ArrayList<Object> list= (ArrayList<Object>) ob;
					suma+=productSumHelper(list, factor+1);
				}else{
					suma+=(int)ob;
				}
			}
	    return suma*factor;
		}
	}