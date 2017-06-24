package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streaming {


       public static void main(String[] args) {

              List<Integer> myList = Arrays.asList(2, 3, 5, 7, 9);
              myList.stream()
                    .filter(s -> s > 3)
                    .sorted()
                    .forEach(System.out::println);

              System.out.println("----------------------------------------------------------------------------");

              List<String> myList2 = Arrays.asList("a1", "a2", "b1", "c2", "c1");
              myList2.stream()
                     .filter(s -> s.startsWith("c"))
                     .map(String::toUpperCase)
                     .sorted()
                     .forEach(System.out::println);

              System.out.println("----------------------------------------------------------------------------");

              Arrays.asList("a1", "a2", "a3").stream()
                     .findFirst()
                     .ifPresent(System.out::println);  // a1

             
              System.out.println("----------------------------------------------------------------------------");

              Stream.of("a1", "a2", "a3")
                    .findFirst()
                    .ifPresent(System.out::println);  // a1

              System.out.println("----------------------------------------------------------------------------");

              IntStream.range(1, 4)
                       .forEach(System.out::println);
       }
}
