package com.algoExpert.middle.validIPAddresses;

import java.util.ArrayList;

public class Program {

	public ArrayList<String> validIPAddresses(String string) {
		if (string.length() > 12 || string.length() < 4) return new ArrayList<String>();
		ArrayList<String>resp=new ArrayList<String>();
		int dot1 = 1, dot2 = 2, dot3 = 3;
		boolean isValidFlag=true;
		String segment1,segment2, segment3, segment4;
		while (true) {
			segment1=string.substring(0, dot1);
			segment2=string.substring(dot1, dot2);
			segment3=string.substring(dot2, dot3);
			segment4=string.substring(dot3, string.length());
			if (!isValid(segment1)) {
				break;
			}
			else if (!isValid(segment2)){
				dot1++;
				dot2=dot1+1;
				dot3=dot2+1;
				isValidFlag=false;
				
			}
			else if (!isValid(segment3)){
				dot2++;
				dot3=dot2+1;
				isValidFlag=false;
			}
			else if (!isValid(segment4)){
				dot3++;
				if (dot3>string.length()) break;
				isValidFlag=false;
			}
			if (isValidFlag) {
				System.out.println(segment1+"."+segment2+"."+segment3+ "."+ segment4);
				resp.add(segment1+"."+segment2+"."+segment3+ "."+ segment4);
				dot3++;
				if (dot3==string.length()) {
					dot2++;
					dot3=dot2+1;
				}
			}
			isValidFlag=true;
		}
		return resp;
	}

	private boolean isValid(String segment) {
		if (segment.isEmpty() || Integer.valueOf(segment) > 255 || (segment.length()>1 && segment.charAt(0)=='0' ))
			return false;
		return true;
	}
}
