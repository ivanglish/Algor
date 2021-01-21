package com.algoExpert.middle.smallestDiference;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
  @Test
  public void TestCase1() {
    int[] expected = {28, 26};
    Assert.assertTrue(
        Arrays.equals(
            Program.smallestDifference(
                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
            expected));
  }
}

