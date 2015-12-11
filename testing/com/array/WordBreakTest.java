package com.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class WordBreakTest {

	WordBreak obj = new WordBreak();
	@Test
	public void testWordBreakDP1() {
		Set<String> disc = new HashSet<String>(Arrays.asList("social", "facebook"));
		assertTrue(obj.wordBreakDP("socialnetworkfacebook", disc) == false);
	}
	
	@Test
	public void testWordBreakDP2() {
		Set<String> disc = new HashSet<String>(Arrays.asList("social", "facebook","network"));
		assertTrue(obj.wordBreakDP("socialnetworkfacebook", disc) == true);
	}

	@Test
	public void testWordBreakDP3() {
		Set<String> disc = new HashSet<String>(Arrays.asList());
		assertTrue(obj.wordBreakDP("socialnetworkfacebook", disc) == false);
	}
	
	@Test
	public void testWordBreakRE1() {
		Set<String> disc = new HashSet<String>(Arrays.asList("social", "facebook"));
		assertTrue(obj.wordBreakRE("socialnetworkfacebook", disc) == false);
	}
	
	@Test
	public void testWordBreakRE2() {
		Set<String> disc = new HashSet<String>(Arrays.asList("social", "facebook","network"));
		assertTrue(obj.wordBreakRE("socialnetworkfacebook", disc) == true);
	}

	@Test
	public void testWordBreakRE3() {
		Set<String> disc = new HashSet<String>(Arrays.asList());
		assertTrue(obj.wordBreakRE("socialnetworkfacebook", disc) == false);
	}
}
