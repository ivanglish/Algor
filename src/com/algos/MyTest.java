package com.algos;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static List<SecondClass> objects = new ArrayList<SecondClass>();
   
    public static void main(String args[]) throws InterruptedException {
        SecondClass sc1 = new SecondClass(5);
        SecondClass sc2 = new SecondClass(10);
        SecondClass sc3 = new SecondClass(20);
        sc1 = sc2; 
        sc3 = sc1; 
        sc2 = sc3;
        //sc1 -> 10                  SecondClass(5) without reference GC
        //sc3 -> sc1 -> 10           SecondClass(20) without reference GC
        //sc2 -> sc3 -> sc1 -> 10    SecondClass(10) holds 3 references no GC
        SecondClass sc4 = new SecondClass(40);
        sc4 =null; //eligible for GC
        gcTest();  //sc5 eligible for GC after method complition
        gcTest2(); //sc6 not eligible for GC since theres still a reference to it after methos es executed
        Thread.sleep(2000);
        System.gc();
        Thread.sleep(2000);
        int total = 0;
        for (SecondClass sc : objects)
            total += sc.myId;
        System.out.println("Total Id is: " + total);
    }
    
    public static void gcTest(){
    	SecondClass sc5 = new SecondClass(60);
    }
    
    static SecondClass sc6;
    public static void gcTest2(){
    	sc6 = new SecondClass(80);
    }
}

class SecondClass {
    public int myId = 0;
   
    public SecondClass(int id) {
        myId = id;
    }
   
    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
    	System.out.println(this.myId);
        MyTest.objects.add(this);
    }
}
