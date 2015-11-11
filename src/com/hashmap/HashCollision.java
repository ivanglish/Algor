package com.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashCollision {
 
    public static void main(String[] args) {
 
        Map<MyInnerClass, String> myMap = new HashMap<MyInnerClass, String>();
        myMap.put(new MyInnerClass("AB", "CD"), "First");
         
        //Same hashCode same equals
        //myMap.put(new MyInnerClass("AB", "CD"), "First");
         
        //Same hashCode different equals
        myMap.put(new MyInnerClass("ABC", "D"), "Second");
         
        for (Entry<MyInnerClass, String> entry : myMap.entrySet()) {
        	System.out.println(entry.hashCode());			
		}
        
        
        int[] i= new int[5];
        i[0]=12;
        System.out.println(i[0]);
        
    }
}
 
class MyInnerClass {
    private String StrA;
    private String StrB;
 
    public MyInnerClass(String strA, String strB) {
        super();
        StrA = strA;
        StrB = strB;
    }
 
    @Override
    public int hashCode() {
        return (StrA + StrB).length();
    }
 
    @Override
    public boolean equals(Object obj) {
        if (StrB.length() == StrA.length()) {
            return true;
        }
        return false;
    }
}
