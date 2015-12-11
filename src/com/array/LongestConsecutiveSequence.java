package com.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	/*
	 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
	 * For example, given [100, 4, 200, 1, 3, 2], 
	 * the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.
	 */
	public static int longestConsecutiveLen(int[] num) {
		if(num == null || num.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i : num){
			set.add(i);
		}
		
		int max = 1;
		for(int i : num){
			int left = i - 1;
			int right = i + 1;
			int count = 1;
			
			while(set.contains(left)){
				set.remove(i);
				count++;
				left = left - 1;
				
			}
			
			while(set.contains(right)){
				set.remove(i);
				count++;
				right = right + 1;
				
			}
			
			max = Math.max(count, max);
		}
		return max;
	}
}
