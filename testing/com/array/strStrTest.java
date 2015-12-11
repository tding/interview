package com.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class strStrTest {
	strStr obj = new strStr();
	@Test
	public void test() {
		assertTrue(obj.findString("truelovewithpeople", "love") == 4);
	}

	@Test
	public void testGetKMPArray() {
		assertTrue(Arrays.equals(obj.getKMPArray("ABABAC"),new int[]{0,0,1,2,3,0}));
		assertTrue(Arrays.equals(obj.getKMPArray("abcdabd"),new int[]{0,0,0,0,1,2,0}));
	}
}
