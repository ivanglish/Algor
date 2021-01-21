package com.algoExpert.hard.undersorifySubstring;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void TestCase1() {
		String expected = "_test_this is a _testtest_ to see if _testestest_ it works";
		String output = Program.underscorifySubstring("testthis is a testtest to see if testestest it works", "test");
		Assert.assertTrue(expected.equals(output));
	}

	@Test
	public void TestCase2() {
		String expected = "_test_this is a _testest_ to see if _testest_es it works";
		String output = Program.underscorifySubstring("testthis is a testest to see if testestes it works", "test");
		Assert.assertTrue(expected.equals(output));
	}
	
//	@Test
//	public void TestCase3() {
//		String expected = "_tttttttttttttt_b_ttttt_ctatawta_ttttt_astvb";
//		String output = Program.underscorifySubstring("ttttttttttttttbtttttctatawtatttttastvb", "ttt");
//		Assert.assertTrue(expected.equals(output));
//	}
}
