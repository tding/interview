package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {
	ValidParentheses obj = new ValidParentheses();
	@Test
	public void test() {
		assertTrue(obj.isValid("{[]}()") == true);
		assertTrue(obj.isValid("{[(]}()") == false);
		assertTrue(obj.isValid("") == true);
	}

}
