package com.algoExpert.easy.ceaserCipherEncryptor;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
	  @Test
	  public void TestCase1() {
	    Assert.assertTrue(Program.caesarCypherEncryptor("xyz", 2).equals("zab"));
	  }
	}


