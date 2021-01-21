package com.algoExpert.middle.moveElementToEnd;

import java.util.ArrayList;
import java.util.List;

public class Program {
	  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
			if (array.size()==0) return new ArrayList<Integer>();
	    int pointerStart=0, pointerEnd=array.size()-1, aux;
			boolean flag=true;
			while(pointerStart!=pointerEnd){
				if (array.get(pointerEnd)==toMove) {
					pointerEnd--;
					continue;
				}
				if (array.get(pointerStart)==toMove){
					aux=array.get(pointerStart);
					array.set(pointerStart,array.get(pointerEnd));
					array.set(pointerEnd,aux);
				}
				pointerStart++;
			}
	    return array;
	  }
	}