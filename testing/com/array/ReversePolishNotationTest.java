package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReversePolishNotationTest {
	ReversePolishNotation obj = new ReversePolishNotation();
	@Test
	public void testEvalRPN1() {
		assertTrue(obj.evalRPN(new String[]{"2", "1", "+", "3", "*"}) == 9);
	}
	
	@Test
	public void testEvalRPN2() {
		assertTrue(obj.evalRPN(new String[]{"4", "13", "5", "/", "+"}) == 6);
	}

}
