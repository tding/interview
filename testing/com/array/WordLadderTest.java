package com.array;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class WordLadderTest {

	WordLadder obj = new WordLadder();
	@Test
	public void test1() {
		Set<String> wordDict = new HashSet<String>(Arrays.asList("hot","dot","dog","lot","log"));
		assertTrue(obj.ladderLength("hit", "cog", wordDict) == 5);
	}
	
	@Test
	public void test2() {
		Set<String> wordDict = new HashSet<String>(Arrays.asList("a","b","c"));
		assertTrue(obj.ladderLength("a", "c", wordDict) == 2);
	}

}
