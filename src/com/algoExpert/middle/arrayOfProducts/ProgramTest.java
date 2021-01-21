package com.algoExpert.middle.arrayOfProducts;

//This file is initialized with a code version of this
//question's sample test case. Feel free to add, edit,
//or remove test cases in this file as you see fit!

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void TestCase1() {
	 int[] input = new int[] {5, 1, 4, 2};
	 int[] expected = new int[] {8, 40, 10, 20};
	 int[] actual = new Program().arrayOfProducts(input);
	 Assert.assertTrue(expected.length == actual.length);
	 for (int i = 0; i < actual.length; i++) {
	   Assert.assertTrue(actual[i] == expected[i]);
	 }
	}
}