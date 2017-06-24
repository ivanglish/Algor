package com.streams;

import java.util.Arrays;



public class Streaming2 {

       public static void main(String[] args) {

              String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};

              //to an array
             String[] myNewArray = Arrays.stream(myArray).map(s -> s.toUpperCase()).toArray(String[]::new);
             for (int i = 0; i < myNewArray.length; i++) {

                     System.out.println(myNewArray[i]);
             }
              
             //printing out
             Arrays.stream(myArray).map(s -> s.toUpperCase()).forEach(System.out::println);
       }
}
