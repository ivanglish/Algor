package com.algoExpert.easy.twoNumberSum;

//This file is initialized with a code version of this
//question's sample test case. Feel free to add, edit,
//or remove test cases in this file as you see fit!

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void TestCase1() {
	 int[] output = Program.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
	 Assert.assertTrue(output.length == 2);
	 Assert.assertTrue(contains(output, -1));
	 Assert.assertTrue(contains(output, 11));
	}
	
	public boolean contains(int[] output, int val) {
	 for (int el : output) {
	   if (el == val) return true;
	 }
	 return false;
	}
}


