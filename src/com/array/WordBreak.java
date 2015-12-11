package com.array;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBreak {
	
	/* Given a string s and a dictionary of words dict, 
	 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
	 * For example, given
		s = "leetcode",
		dict = ["leet", "code"].
        Return true because "leetcode" can be segmented as "leet code".
	 */
	
	//Dynamic Progamming, Time: O(len*size)
	 public boolean wordBreakDP(String s, Set<String> dict) {
		 boolean[] flag = new boolean[s.length()+1];
		 flag[0] = true;
		 
		 //flag[i] = true => subString(0,i) (from 0 to i-1) can be segmented
		 for(int i=0;i<s.length();i++){
			 
			 if(flag[i] == false) continue;
			 
			 for(String word : dict){
				 int wordLen = word.length();
				 int end = i+wordLen;
				 if(end > s.length()) continue;
				 
				 if(flag[end] == true) continue;
				 
				 if(s.substring(i, end).equals(word)){
					 flag[end] = true;
				 }
			 }
		 }
          return flag[s.length()];
	 }
	 
	 //Regular Expression
	 public boolean wordBreakRE(String s, Set<String> dict){
		 StringBuffer buff = new StringBuffer();
		 for(String word:dict){
			 buff.append(word+"|");
		 }
		 
		 String pattern = "("+buff.toString()+")*";
		 Pattern p = Pattern.compile(pattern);
		 Matcher m = p.matcher(s);
		 return m.matches();
		 
	 }
}
