package com.atlassian.me;

public class FindCommonAncestorTest {

//       E - F         F   -   E
//      /      \      /         \
//  A -B -C -D -G    G - D - C - B - A
	
	public static void main(String[] args) {
		String [][] parents = {{"F","D"},{"E"},{"B"},{"C"},{"B"},{"A"},{"root"}};
		String [] commits =      {"G",    "F",  "E",  "D",  "C",  "B",   "A"};
		String commit1 = "F";
		String commit2 = "G";
		MyFindCommonAncestor mfca= new MyFindCommonAncestor();
		System.out.println(mfca.findCommmonAncestor(commits, parents, commit1, commit2));

	}

}
