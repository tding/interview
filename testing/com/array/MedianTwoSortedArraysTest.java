package com.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class MedianTwoSortedArraysTest {

	MedianTwoSortedArrays obj = new MedianTwoSortedArrays();
	@Test
	public void testKth() {
		assertTrue(MedianTwoSortedArrays.findKthNum(new int[]{1,2,3,4,5,6,7}, new int[]{2,5}, 3)==2);
		assertTrue(MedianTwoSortedArrays.findKthNum(new int[]{11,12,23,36,45,73}, new int[]{24,35}, 5)==35);
		assertTrue(MedianTwoSortedArrays.findKthNum(new int[]{1,2,3,4,5,6,7}, new int[]{22,23,25,27,28}, 10)==25);
		assertTrue(MedianTwoSortedArrays.findKthNum(new int[]{24,35}, new int[]{34,45,56,67}, 3)==35);
	}

}
