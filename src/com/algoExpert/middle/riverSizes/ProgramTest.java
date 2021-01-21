package com.algoExpert.middle.riverSizes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

//This file is initialized with a code version of this
//question's sample test case. Feel free to add, edit,
//or remove test cases in this file as you see fit!

import java.util.*;

public class ProgramTest {
@Test
public void TestCase1() {
 int[][] input = {
   {1, 0, 0, 1, 0},
   {1, 0, 1, 0, 0},
   {0, 0, 1, 0, 1},
   {1, 0, 1, 0, 1},
   {1, 0, 1, 1, 0},
 };
 int[] expected = {1, 2, 2, 2, 5};
 List<Integer> output = Program.riverSizes(input);
 Collections.sort(output);
 Assert.assertTrue(compare(output, expected));
}

public static boolean compare(List<Integer> arr1, int[] arr2) {
 if (arr1.size() != arr2.length) {
   return false;
 }
 for (int i = 0; i < arr1.size(); i++) {
   if (arr1.get(i) != arr2[i]) {
     return false;
   }
 }
 return true;
}
}


