package com.algoExpert.easy.runLengthEncoding;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
  @Test
  public void TestCase1() {
    String input = "AAAAAAAAAAAAABBCCCCDD";
    String expected = "9A4A2B4C2D";
    String actual = new Program().runLengthEncoding(input);
    Assert.assertTrue(expected.equals(actual));
  }
}

