package com.array;

public class MedianTwoSortedArrays {
	/*There are two sorted arrays A and B of size m and n respectively. 
	 * Find the median of the two sorted arrays. 
	 * The overall run time complexity should be O(log (m+n)).
	 */
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1.length + nums2.length)%2 ==0){
            return (findKthNum(nums1,nums2,(nums1.length + nums2.length)/2) + findKthNum(nums1,nums2,(nums1.length + nums2.length)/2+1))/2;
        }
        else{
            return findKthNum(nums1,nums2,(nums1.length + nums2.length)/2+1);
        }
    }
    
	//O(k);
    public static double findKthNum(int[] A, int[] B, int k){
        int i=0;
		int j=0;
		int index = 0;
		double median = 0;
		
		while(i<A.length && j<B.length && index < k){
			
			if(A[i]<B[j]){
				median = A[i];
				i++;
			}
			else{
				median = B[j];
				j++;
			}
			if(index == k-1) return median;
			index++;
		}
		
		while(i<A.length && index < k){
			median = A[i];
			i++;
			index++;
		}

		while(j<B.length && index < k){
			median = B[j];
			j++;
			index++;
		}
		return median;
    }
}
