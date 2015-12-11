package com.array;

public class LongestPalindromicSubstring {
	/*Finding the longest palindromic substring is a classic problem of coding interview. 
	 * palindromic: aa, aba, abba, abcba
	 */
	
	//Space: O(n^2) Time: O(n^2)
	public  String LongestPalindrome(String s) {
		if(s == null) 
			return null;
		if(s.length() <= 1) 
			return s;
		
		String pString = "";
		int len = s.length();
		int[][] m = new int[len][len];
		
		for(int i=0;i<len;i++){
			m[i][i] = 1;
		}
		
		int maxLen = 0;
		for(int i=0;i<len-1;i++){
			if(s.charAt(i) == s.charAt(i+1)){
				m[i][i+1] = 1;
				pString = s.substring(i, i+2);
			}
		}
		for(int l=3;l<len;l++){
			for(int i=0;i<len-l;i++){
				//length from i to j is l
				int j = i+l-1;
				if(s.charAt(i) == s.charAt(j)){
					m[i][j] = m[i+1][j-1];
					if(m[i][j] == 1 && l > maxLen){
						// i to j is Palindrome
						pString = s.substring(i,i+l);
					}
				}
				else{
					m[i][j] = 0;
				}
			}
		}
		return pString;
	}
	
	public  String LongestPalindrome2(String s) {
		if(s == null) 
			return null;
		if(s.length() <= 1) 
			return s;
		
		String pString = s.substring(0,1);
		
		for(int i=0;i<s.length();i++){
			//length of Palindrome is odd number.
			String tmp = findLongestPalindromeOnPoint(s,i,i);
			if(tmp.length() >= pString.length()){
				pString = tmp;
			}
			
			//length of Palindrome is even number.
			tmp = findLongestPalindromeOnPoint(s,i,i+1);
			if(tmp.length() >= pString.length()){
				pString = tmp;
			}
		}
		return pString;
		
	}
	
	public String findLongestPalindromeOnPoint(String s, int begin, int end){
		while(begin >=0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
			begin--;
			end++;
		}
		return s.substring(begin+1,end);
	}
}
