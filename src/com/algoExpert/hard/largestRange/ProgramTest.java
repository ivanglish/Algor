package com.algoExpert.hard.largestRange;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
  @Test
  public void TestCase1() {
    int[] expected = {0, 7};
    Assert.assertTrue(
        Arrays.equals(
            Program.largestRange(new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6}), expected));
  }
}


