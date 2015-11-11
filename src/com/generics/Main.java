package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<A> listA = new ArrayList<A>();
		List<B> listB = new ArrayList<B>();
		listB.add(new B());
		//listB.add(new A());//this is wrong
		listA.add(new A());
		listA.add(new B());
		
		String a = "foo";
		String b = "food".substring(0, 3);
		String c = b.intern();
		
		if (a.equals(b)){
			System.out.println("asd");
		}
		
		if (a==b){
			System.out.println("asd2");
		}
		
		System.out.println(b);
		
		System.out.println(c);
		
		
//		if (listA instanceof List<B>){
//			System.out.println("asd");
//		}
		
		
		

	}

}


//String a = "foo";
//String b = "food".substring(0, 3);
//String c = b.intern();
//
//if (a.equals(b)) {
//    if (a == b) {
//        System.out.println("1");
//    } else if (a == c) {
//        System.out.println("2");
//    } else {
//        System.out.println("3");
//    }
//} else {
//    System.out.println("4");
//}
