package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	/*
	 * Given an array of integers, find two numbers such that they add up to a specific target number.
		The function twoSum should return indices of the two numbers such that they add up to the target, 
		where index1 must be less than index2. 
		Please note that your returned answers (both index1 and index2) are not zero-based.
	 */
	
	//Array is not sorted
	public int[] sum(int[] nums, int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int[] result = new int[2];
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			}
			else{
				map.put(target-nums[i], i);
			}
		}
		
		return result;
	}
	
	
	public List<ArrayList<Integer>> twoSum(int nums[], int target){
		List<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int index = map.get(nums[i]);
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(index + 1);
				list.add(i+1);
				results.add(list);
				break;
			}
			else{
				map.put(target-nums[i], i);
			}
		}
		return results;
	}
	
	//Array is sorted
		public int[] sumSortedArray(int[] nums, int target){
			if(nums == null || nums.length == 0) return null;
			int i = 0;
			int j = nums.length-1;
			
			while(i<j){
				int s = nums[i] + nums[j];
				if(s == target){
					return new int[]{i+1, j+1};
				}
				else if(s < target){
					i++;
				}
				else{
					j++;
				}
			}
			return null;
		}
	
}
