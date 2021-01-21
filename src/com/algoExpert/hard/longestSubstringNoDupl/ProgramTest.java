package com.algoExpert.hard.longestSubstringNoDupl;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	@Test
	public void TestCase1() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("clementisacap").equals("mentisac"));
	}

	@Test
	public void TestCase2() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("abcb").equals("abc"));
	}
	
	@Test
	public void TestCase3() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("a").equals("a"));
	}
	
	@Test
	public void TestCase4() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("abc").equals("abc"));
	}
	
	@Test
	public void TestCase5() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("abccdeaabbcddef").equals("cdea"));
	}
	
	@Test
	public void TestCase6() {
		Assert.assertTrue(Program.longestSubstringWithoutDuplication("abcdeabcdefc").equals("abcdef"));
	}
	
}
