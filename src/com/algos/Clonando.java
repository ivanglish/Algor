package com.algos;

class Clonando implements Cloneable{  
	int rollno;  
	String name;  
	  
	Clonando(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	
	public static void main(String args[]){  
	try{  
		Clonando s1=new Clonando(101,"amit");  
		  
		Clonando s2=(Clonando)s1.clone();  
		  
		System.out.println(s1.rollno+" "+s1.name);  
		System.out.println(s2.rollno+" "+s2.name);  
		  
		}catch(CloneNotSupportedException c){}  
		  
	}  
} 