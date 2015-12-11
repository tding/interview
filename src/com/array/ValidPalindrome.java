package com.array;

public class ValidPalindrome {
	public boolean isValid(String s){
		if(s == null || s.length() == 0) return true;
		if(s.length() == 1) return true;
		
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
}
