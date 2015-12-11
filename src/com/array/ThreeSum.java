package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
	/**
	 * Given an array S of n integers, 
	 * are there elements a, b, c in S such that a + b + c = 0? 
	 * Find all unique triplets in the array which gives the sum of zero
	 */
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        
	        
	        List<List<Integer>> result = new ArrayList<List<Integer>>(); 
	        if(nums == null || nums.length < 4) return result;
	        
	        HashSet<List<Integer>> uniqueCheck = new HashSet<List<Integer>>();
	        
	        Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length-3;i++){
	            for(int j=i+1;j<nums.length-2;j++){
	                int start = j+1;
	                int end = nums.length-1;
	                
	                while(start < end){
	                    int s = nums[start] + nums[end] + nums[i] + nums[j];
	                    if(s == target){
	                        List<Integer> temp = new ArrayList<Integer>();
	                        temp.add(nums[i]);
	                        temp.add(nums[j]);
	                        temp.add(nums[start]);
	                        temp.add(nums[end]);
	                        start++;
	                        end--;
	                        
	                        if(!uniqueCheck.contains(temp)){
	                            uniqueCheck.add(temp);
	                            result.add(temp);
	                        }
	                    }
	                    else if(s < target){
	                        start++;
	                    }
	                    else{
	                        end--;
	                    }
	                }
	            }
	        }
	        return result;
	        
	    }
}
