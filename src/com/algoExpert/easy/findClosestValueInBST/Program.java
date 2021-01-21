package com.algoExpert.easy.findClosestValueInBST;

public class Program {
	
	static int  cercano = 0;
	  public static int findClosestValueInBst(BST tree, int target) {
	    ayudantePreorden( tree ,  target);
	    return cercano;
	  }

	  static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }
	  }
		
		private static void ayudantePreorden(BST tree , int target){
			if (tree == null)
				return;
			else
			{
				if (tree.value == target) {
				  cercano = target;
					return;
			  }
			}
			int aux=target - cercano;
			if (Math.abs(aux) > Math.abs((target - tree.value))) {
				cercano = tree.value;
			}
			
			if (target<tree.value && tree.left !=null){
				ayudantePreorden(tree.left, target); //recorre subarbol izquierdo
			}else if (target>tree.value && tree.right !=null){
				ayudantePreorden(tree.right, target); //recorre subarbol derecho
			}
		}
}
