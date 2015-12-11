package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WordBreakII {
	
	/* Given a string s and a dictionary of words dict, 
	 * add spaces in s to construct a sentence where each word is a valid dictionary word. 
	 * Return all such possible sentences. 
	 * For example, given s = "catsanddog", 
	 * dict = ["cat", "cats", "and", "sand", "dog"], 
	 * the solution is ["cats and dog", "cat sand dog"].
	 */
	
	public static List<String> wordBreak(String s, Set<String> dict) {
		List<String>[] wordList = (ArrayList<String>[]) new ArrayList[s.length()+1];
		wordList[0] = new ArrayList<String>();
		
		for(int i=0;i<s.length();i++){
			if(wordList[i] == null) continue;
			
			for(String word : dict){
				int wordLen = word.length();
				int end = i + wordLen;
				if(end > s.length()) continue;
				
				if(s.substring(i,end).equals(word)){
					if(wordList[end] == null){
						wordList[end] = new ArrayList<String>();
					}
					wordList[end].add(word);
				}
			}
		}
		
		List<String> results = new ArrayList<String>();
		if(wordList[s.length()] == null) return results;
		
		String str = "";
		getAllCombination(results,wordList,wordList.length-1,str);
		
		return results;
	}
	
	public static void getAllCombination(List<String> results,List<String>[] wordList,int lastIndex,String currentResult){
		if(lastIndex == 0){
			currentResult = currentResult.trim();
			results.add(currentResult);
			return;
		}
		
		for(String word :wordList[lastIndex]){
			currentResult = word+" "+currentResult;
			int i = lastIndex - word.length();
			getAllCombination(results,wordList,i,currentResult);
			currentResult = currentResult.substring(currentResult.indexOf(' ')+1);
		}
	}
}
