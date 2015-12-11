package com.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RotateArrayTest {

	public ExpectedException thrown = ExpectedException.none();
	RotateArray obj = new RotateArray();
	@Test
	public void testRotate1() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.rotate(nums, 3);
		assertTrue(Arrays.equals(nums, new int[]{5,6,7,1,2,3,4}));
	}
	@Test
	public void testRotate2() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.rotate(nums, 4);
		assertTrue(Arrays.equals(nums, new int[]{4,5,6,7,1,2,3}));
	}
	
	@Test
	public void testRotate3() {
		int[] nums = new int[]{1,2};
		obj.rotate(nums, 0);
		assertTrue(Arrays.equals(nums, new int[]{1,2}));
	}
	
	@Test
	public void testRotate4() {
		int[] nums = new int[]{1,-2};
		obj.BubbleRotate(nums, 0);
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test
	public void testBubbleRotate1() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.BubbleRotate(nums, 3);
		assertTrue(Arrays.equals(nums, new int[]{5,6,7,1,2,3,4}));
	}
	@Test
	public void testBubbleRotate2() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.BubbleRotate(nums, 4);
		assertTrue(Arrays.equals(nums, new int[]{4,5,6,7,1,2,3}));
	}
	
	@Test
	public void testBubbleRotate3() {
		int[] nums = new int[]{1,2};
		obj.BubbleRotate(nums, 0);
		assertTrue(Arrays.equals(nums, new int[]{1,2}));
	}
	
	@Test
	public void testBubbleRotate4() {
		int[] nums = new int[]{1,-2};
		obj.BubbleRotate(nums, 0);
		thrown.expect(IllegalArgumentException.class);
	}
	
	@Test
	public void testReverseRotate1() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.ReverseRotate(nums, 3);
		assertTrue(Arrays.equals(nums, new int[]{5,6,7,1,2,3,4}));
	}
	@Test
	public void testReverseRotate2() {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		obj.ReverseRotate(nums, 4);
		assertTrue(Arrays.equals(nums, new int[]{4,5,6,7,1,2,3}));
	}
	
	@Test
	public void testReverseRotate3() {
		int[] nums = new int[]{1,2};
		obj.ReverseRotate(nums, 0);
		assertTrue(Arrays.equals(nums, new int[]{1,2}));
	}
	
	@Test
	public void testReverseRotate4() {
		int[] nums = new int[]{1,-2};
		obj.ReverseRotate(nums, 0);
		thrown.expect(IllegalArgumentException.class);
	}
}
