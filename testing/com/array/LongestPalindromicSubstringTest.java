package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindromicSubstringTest {
	
	LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
	@Test
	public void testLongestPalindrome1() {
		assertTrue(obj.LongestPalindrome("rabccbae").equals("abccba"));
	}
	
	@Test
	public void testLongestPalindrome2() {
		assertTrue(obj.LongestPalindrome("rabcbae").equals("abcba"));
	}

	@Test
	public void testLongestPalindrome3() {
		assertTrue(obj.LongestPalindrome("aabbcdae").equals("bb"));
	}
	
	@Test
	public void testLongestPalindrome2_1() {
		assertTrue(obj.LongestPalindrome2("rabccbae").equals("abccba"));
	}
	
	@Test
	public void testLongestPalindrome2_2() {
		assertTrue(obj.LongestPalindrome2("rabcbae").equals("abcba"));
	}

	@Test
	public void testLongestPalindrome2_3() {
		assertTrue(obj.LongestPalindrome2("aabbcdae").equals("bb"));
	}
	
}
