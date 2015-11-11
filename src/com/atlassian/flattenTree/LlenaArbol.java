package com.atlassian.flattenTree;

import java.util.List;

public class LlenaArbol {
	
	
	public static void main(String args[]) {
		Tree<Integer> lastLevel = Tree.Node.tree(new Integer(5), new Integer(4), new Integer(9));
		Tree<Integer> root = new Tree.Node<Integer>(Tree.Leaf.leaf(new Integer(1)), lastLevel, Tree.Leaf.leaf(new Integer(6)));
		MyFlattenTree<Integer> myFlattenTree = new MyFlattenTree<Integer>();
		List<Integer> results = myFlattenTree.flattenInOrder(root);
		for (Integer result : results) {
			System.out.print(result + ", ");
		}
	}

}
