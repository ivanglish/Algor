package com.algoExpert.middle.monothonicArray;

import org.junit.Assert;
import org.junit.Test;

//This file is initialized with a code version of this
//question's sample test case. Feel free to add, edit,
//or remove test cases in this file as you see fit!

public class ProgramTest {
	@Test
	public void TestCase1() {
		 int[] array = new int[] {1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11};
		 boolean expected = true;
		 boolean actual = Program.isMonotonic(array);
		 Assert.assertEquals(expected, actual);
	}
}


