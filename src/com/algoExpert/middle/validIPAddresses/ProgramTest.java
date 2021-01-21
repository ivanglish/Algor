package com.algoExpert.middle.validIPAddresses;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	
  @Test
  public void TestCase1() {
    String input = "1921680";
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("1.9.216.80");
    expected.add("1.92.16.80");
    expected.add("1.92.168.0");
    expected.add("19.2.16.80");
    expected.add("19.2.168.0");
    expected.add("19.21.6.80");
    expected.add("19.21.68.0");
    expected.add("19.216.8.0");
    expected.add("192.1.6.80");
    expected.add("192.1.68.0");
    expected.add("192.16.8.0");
    ArrayList<String> actual = new Program().validIPAddresses(input);
    Assert.assertTrue(expected.equals(actual));
  }
  
  @Test
  public void TestCase2() {
    String input = "255255255255";
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("255.255.255.255");
    ArrayList<String> actual = new Program().validIPAddresses(input);
    Assert.assertTrue(expected.equals(actual));
  }
  
  @Test
  public void TestCase3() {
    String input = "997430";
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("9.9.74.30");
    expected.add("9.97.4.30");
    expected.add("9.97.43.0");
    expected.add("99.7.4.30");
    expected.add("99.7.43.0");
    expected.add("99.74.3.0");
    ArrayList<String> actual = new Program().validIPAddresses(input);
    Assert.assertTrue(expected.equals(actual));
  }
}

