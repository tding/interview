package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegularExpressionMatchingTest {
	
	RegularExpressionMatching obj = new RegularExpressionMatching();
	@Test
	public void test() {
		assertTrue(obj.isMatch("aa","a") == false);
		assertTrue(obj.isMatch("aa","aa") == true);
		assertTrue(obj.isMatch("aaa","aa") == false);
		assertTrue(obj.isMatch("aa", "a*") == true);
		assertTrue(obj.isMatch("aa", ".*") == true);
		assertTrue(obj.isMatch("ab", ".*") == true);
		assertTrue(obj.isMatch("aab", "c*a*b") == true);
		assertTrue(obj.isMatch("", "") == true);
		assertTrue(obj.isMatch("", "*") == false);
		assertTrue(obj.isMatch("a", ".") == true);
	}

}
