package com.array;

public class strStr {
	/*
	 * Implement strStr().
		Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 */
	
	//O(mn)
	public int findString(String haystack, String needle){
		
		if(haystack == null || needle == null || needle.length() == 0 || haystack.length() ==0)
			return -1;
		
		for(int i=0;i<haystack.length();i++){
			if(needle.length()+i > haystack.length()) return -1;
			
			int k = i;
			for(int j=0;j<needle.length();j++){
				if(needle.charAt(j) == haystack.charAt(k)){
					if(j == needle.length()-1){
						return i;
					}
					k++;
				}
				else{
					break;
				}
			}
		}
		
		return -1;
	}
	
	//O(mn)
		public int findStringKMP(String haystack, String needle){
			
			if(haystack == null || needle == null || needle.length() == 0 || haystack.length() ==0)
				return 0;
			
			int n = haystack.length();
			int m = needle.length();
			
			
			if(m > n) return -1;
			
			int[] lpa = getKMPArray(needle);
			
			for(int i=0;i<haystack.length();i++){
				if(needle.length()+i > haystack.length()) return -1;
				
				int k = i;
				for(int j=0;j<needle.length();j++){
					if(needle.charAt(j) == haystack.charAt(k)){
						if(j == needle.length()-1){
							return i;
						}
						k++;
					}
					else{
						break;
					}
				}
			}
			
			return -1;
		}
	
	//longest proper prefix which is proper suffix
	public int[] getKMPArray(String pattern){
		int[] arr = new int[pattern.length()];
		arr[0] = 0;
		
		int index = 0;
		for(int i=1;i<pattern.length();i++){
			if(pattern.charAt(index) == pattern.charAt(i)){
				arr[i] = arr[i-1]+1;
				index++;
			}
			else{
				arr[i] = 0;
				index = 0;
			}
		}
		return arr;
	}
	
}
