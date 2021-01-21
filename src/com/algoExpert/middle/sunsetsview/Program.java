package com.algoExpert.middle.sunsetsview;

import java.util.ArrayList;

class Program {

	  public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
			ArrayList<Integer> resp=new ArrayList<Integer>();
			int index,cont=0;
			int max=0;
			if (direction.equals("EAST")) {
				index=buildings.length-1;
				max=Integer.MIN_VALUE;
			}else{
				index=0;
				max=Integer.MIN_VALUE;
			}
			while(cont<buildings.length){
				if (direction.equals("EAST")) {
					if (buildings[index]>max){
						max=buildings[index];
						resp.add(0,index);
					}	
					index--;
				}else{
					if (buildings[index]>max){
						max=buildings[index];
						resp.add(index);
					}	
					index++;
				}
				cont++;
			}
	    return resp;
	  }
	}

