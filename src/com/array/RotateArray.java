package com.array;

public class RotateArray {
	//Problem: Rotate an array of n elements to the right by k steps. 
	//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
	
	
	//Space is O(n), time is O(n)
	public void rotate(int[] nums ,int k){
		 if(nums == null || k< 0)
			 throw new IllegalArgumentException("Illegal Argument");
		 
		 if(k > nums.length) 
		        k = k%nums.length;
		 
		  int[] result = new int[nums.length];
		  
		  for(int i=0; i < k; i++){
		     result[i] = nums[nums.length-k+i];
		  }
		  
		  int j=0;
		  for(int i=k; i<nums.length; i++){
		      result[i] = nums[j];
		      j++;
		  }
		        
		  System.arraycopy( result, 0, nums, 0, nums.length );
	}
	
	//Space is O(0), time is O(n*k)
	public void BubbleRotate(int[] nums ,int k){
		 if(nums == null || k< 0)
			 throw new IllegalArgumentException("Illegal Argument");
		 
		 if(k > nums.length) 
		        k = k%nums.length;
		 
		 for(int i=0;i<k;i++){
			 for(int j=nums.length-1;j>0;j--){
				 int temp = nums[j];
				 nums[j] = nums[j-1];
				 nums[j-1] = temp;
			 }
		 } 
	}
	
	//Space is O(0), time is O(n)
	public void ReverseRotate(int[] nums ,int k){
		 if(nums == null || k< 0)
			 throw new IllegalArgumentException("Illegal Argument");
		 
		 if(k > nums.length) 
		        k = k%nums.length;
		 
		 reserve(nums, 0, nums.length-k-1);
		 reserve(nums,nums.length-k,nums.length-1);
		 reserve(nums,0,nums.length-1);
	}
	
	public void reserve(int[] nums, int start, int end){
		if(nums == null || nums.length == 1) return;
		
		while(start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	
}
