package com.array;

public class SearchInsertPosition {
	
	public int search(int[] A, int target){
		if(A == null || A.length ==0) return 0;
		return binarySeach(A,target, 0, A.length-1);
	}
	
	public int binarySeach(int[] A,int target, int min, int max){
		int mid = (min+max)/2;
		
		if(target == A[mid])
			return mid;
		else if(target > A[mid]){
			if(max > mid){
				return binarySeach(A,target,mid+1,max);
			}
			else{
				return max+1;
			}
		}
		else{
			if(min < mid){
				return binarySeach(A,target,min,mid-1);
			}
			else{
				return min-1;
			}
		}
		
	}
}
