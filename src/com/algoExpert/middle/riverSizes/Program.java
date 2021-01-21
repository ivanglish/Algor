package com.algoExpert.middle.riverSizes;

import java.util.*;

class Program {
	
	static int riverSize=0;
	
  public static List<Integer> riverSizes(int[][] matrix) {
    List<Integer> salida = new ArrayList<>();
		boolean [][] visited= new boolean[matrix.length][matrix[0].length];
		for (int i = 0;i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (visited[i][j]){
					continue;
				}
				traverseNode(i,j, matrix, visited, salida);
			}
		}
		return salida;
	}
	
	public static void traverseNode(int i , int j , int[][] matrix, boolean [][] visited, List<Integer> salida){
		
		visited[i][j]=true;
		if (matrix[i][j]==1){
			riverSize++;
			if (i>0 && !visited[i-1][j]){
					traverseNode(i-1,j, matrix, visited, salida);
			}
			if (j>0 && !visited[i][j-1]){
					traverseNode(i,j-1, matrix, visited, salida);
			}
			if (i<matrix.length-1 && !visited[i+1][j]){
					traverseNode(i+1,j, matrix, visited, salida);
			}
			if (j<matrix[0].length - 1 && !visited[i][j+1]){
					traverseNode(i,j+1, matrix, visited, salida);
			}
			if (riverSize>0){
				salida.	add(riverSize);
			}
			riverSize=0;
		}
	}
}


