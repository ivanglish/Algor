package com.algoExpert.easy.productSum;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
  @Test
  public void TestCase1() {
    List<Object> test =
        new ArrayList<Object>(
            Arrays.asList(
                5,
                2,
                new ArrayList<Object>(Arrays.asList(7, -1)),
                3,
                new ArrayList<Object>(
                    Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
    Assert.assertTrue(Program.productSum(test) == 12);
  }
}

