package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumClosestTest {
	ThreeSumClosest obj = new ThreeSumClosest();
	@Test
	public void test() {
		assertTrue(obj.SumClosest(new int[]{-1,2,1,-4}, 1) == 2);
		assertTrue(obj.SumClosest(new int[]{2,-1,4,6,3}, 4) == 4);
	}

}
