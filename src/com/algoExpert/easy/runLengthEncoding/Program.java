package com.algoExpert.easy.runLengthEncoding;

public class Program {
	  public String runLengthEncoding(String string) {
			int num=0;
			Character aux = null;
			StringBuilder resp = new StringBuilder(); //no usar concatenation. seria o(n2)
			char[] JavaCharArray = new char[string.length()]; //usar char string o(1)
	    for (int i=0;i<string.length();i++){
				if (aux==null){
					aux=string.charAt(i);
					num=1;
					continue;
				}
				if (aux.equals(string.charAt(i))){
					num++;
					if (num==9){
						resp.append(num);
						resp.append(aux);
						num=0;
					}
				}else if (num==0) {
						aux=string.charAt(i);
						num++;
				}
				else{
					resp.append(num);
					resp.append(aux);
					aux=string.charAt(i);
					num=1;
				}
			}
			resp.append(num);
			resp.append(aux);
	    return resp.toString();
	  }
	}


