package com.array;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class WordBreakIITest {

	WordBreakII obj = new WordBreakII();
	@Test
	public void test1() {
		Set<String> disc = new HashSet<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		List<String> results = obj.wordBreak("catsanddog", disc);
		List<String> expected = new ArrayList<String>();
		expected.add("cats and dog"); 
		expected.add("cat sand dog");
		assertTrue(results.containsAll(expected)&&expected.containsAll(results));
	}
	
	public void test2() {
		Set<String> disc = new HashSet<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		List<String> results = obj.wordBreak("catssanddog", disc);
		List<String> expected = new ArrayList<String>();
		expected.add("cats sand dog");
		assertTrue(results.containsAll(expected)&&expected.containsAll(results));
	}
	
	public void test3() {
		Set<String> disc = new HashSet<String>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
		List<String> results = obj.wordBreak("catlssanddog", disc);
		List<String> expected = new ArrayList<String>();
		assertTrue(results.containsAll(expected)&&expected.containsAll(results));
	}

}
