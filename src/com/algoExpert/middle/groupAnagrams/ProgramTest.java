package com.algoExpert.middle.groupAnagrams;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
  @Test
  public void TestCase1() {
    List<String> words =
        new ArrayList<String>(
            Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
    List<List<String>> expected = new ArrayList<List<String>>();
    expected.add(new ArrayList<String>(Arrays.asList("yo", "oy")));
    expected.add(new ArrayList<String>(Arrays.asList("flop", "olfp")));
    expected.add(new ArrayList<String>(Arrays.asList("act", "tac", "cat")));
    expected.add(new ArrayList<String>(Arrays.asList("foo")));
    List<List<String>> output = Program.groupAnagrams(words);
    for (List<String> innerList : output) {
      Collections.sort(innerList);
    }
    Assert.assertTrue(compare(expected, output));
  }

  public boolean compare(List<List<String>> expected, List<List<String>> output) {
    if (expected.size() != output.size()) return false;

    for (List<String> group : expected) {
      Collections.sort(group);
      if (!output.contains(group)) return false;
    }

    return true;
  }
}

