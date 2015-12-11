package com.array;

public class RegularExpressionMatching {
	/*
	 	The function prototype should be:
		bool isMatch(const char *s, const char *p)

		Some examples:
		isMatch("aa","a") return false
		isMatch("aa","aa") return true
		isMatch("aaa","aa") return false
		isMatch("aa", "a*") return true
		isMatch("aa", ".*") return true
		isMatch("ab", ".*") return true
		isMatch("aab", "c*a*b") return true
	*/
	public boolean isMatch(String str, String pattern){
		
		//special case: length of pattern is 0
		if(pattern.length() == 0){
			return str.length() == 0;
		}
		
		//special case: length of pattern is 1
		if(pattern.length() == 1){
			if(str.length() == 0) return false;
			
			if(pattern.charAt(0) != str.charAt(0) && pattern.charAt(0) != '.')
				return false;
			else
				return isMatch(str.substring(1), pattern.substring(1));
		}
		
		//pattern length > 1
		//second char is *
		if(pattern.charAt(1) == '*'){
			//case 1: first two chars represent 0 element
			if(isMatch(str,pattern.substring(2))){
				return true;
			}
			
			//case 2: first two chars represent 1 or more elements
			int i=0;
			while(i<str.length() && (pattern.charAt(0) == str.charAt(i) || pattern.charAt(0) == '.' )){
				if(isMatch(str.substring(i+1),pattern.substring(2))){
					return true;
				}
				i++;
			}
			return false;
		}
		else{
			if(str.length() == 0) return false;
			
			if(pattern.charAt(0) != str.charAt(0) && pattern.charAt(0) != '.'){
				return false;
			}
			else{
				return isMatch(str.substring(1),pattern.substring(1));
			}
		}
		
	}
}
