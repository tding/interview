package com.array;

import java.util.Arrays;

public class ThreeSumClosest {
	public int SumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			
			int j = i+1;
			int m = nums.length-1;
			while(j < m){
				int sum = nums[i] + nums[j] + nums[m];
				int diff = Math.abs(target - sum);
				if(sum == 0){
					return sum;
				}
				
				if(diff < min){
					min = diff;
					result = sum;
				}
				
				if(sum <= target){
					j++;
				}
				else{
					m--;
				}
			}
		}
		return result;
	}
}
