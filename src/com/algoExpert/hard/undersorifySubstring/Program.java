package com.algoExpert.hard.undersorifySubstring;

public class Program {
	
	public static String underscorifySubstring(String str, String substring) {
		    String [] s=str.split(" ");
			StringBuilder sb=new StringBuilder();				 
			for(int i=0;i<s.length;i++){	
				if (s[i].contains(substring)) {
					if (moreThanOneSubstring(s[i],substring)) {
						s[i]="_"+s[i]+"_";
					}else{
						s[i]= s[i].replace(substring, "_"+substring+"_");
					}								
				}
				sb.append(s[i]+" ");
			}
		    return sb.toString().substring(0, sb.toString().length()-1);
		  }

	private static boolean moreThanOneSubstring(String key, String substring) {
		int idxFirst = key.indexOf(substring);
		if (idxFirst != -1) {
			int idxSecond = key.indexOf(substring, (idxFirst + substring.length())-1);
			if (idxSecond != -1) {
				return true;
			}
		}
		return false;
	}
}
