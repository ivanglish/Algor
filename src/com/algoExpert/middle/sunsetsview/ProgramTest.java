package com.algoExpert.middle.sunsetsview;

//This file is initialized with a code version of this
//question's sample test case. Feel free to add, edit,
//or remove test cases in this file as you see fit!

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void TestCase1() {
	 int[] buildings = new int[] {2,4};
		 String direction = "WEST";
		 ArrayList<Integer> expected = new ArrayList<Integer>();
		 expected.add(1);
		 expected.add(3);
		 expected.add(6);
		 expected.add(7);
		 ArrayList<Integer> actual = new Program().sunsetViews(buildings, direction);
		 Assert.assertTrue(expected.equals(actual));
	}
}

