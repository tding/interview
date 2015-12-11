package com.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	
 /*
  * Given two words (start and end), and a dictionary, 
  * find the length of shortest transformation sequence from start to end, 
  * such that only one letter can be changed at a time and each intermediate word must exist in the dictionary. 
  * For example, given:
  * start = "hit" end = "cog"
  * dict = ["hot","dot","dog","lot","log"]
  * One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", the program should return its length 5.
  */
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		HashMap<String, Integer> wordStep = new HashMap<String, Integer>();
		Queue<String> wordsQueue = new LinkedList<String>();
		wordStep.put(beginWord, 1);
		wordsQueue.add(beginWord);
		
		wordList.add(endWord);
		
		while(!wordsQueue.isEmpty()){
			String word = wordsQueue.poll();
			
			if(word.equals(endWord)){
				return wordStep.get(word);
			}
			else{
				char[] arrWord = word.toCharArray();
				for(int i=0;i<arrWord.length;i++){
					char c = arrWord[i];
					for(char s='a';s<'z';s++){
						if(s != c){
							arrWord[i] = s;
						}
						
						String newWord = new String(arrWord);
						if(wordList.contains(newWord)){
							if(!wordStep.containsKey(newWord)){
								wordStep.put(newWord, wordStep.get(word)+1);
								wordsQueue.add(newWord);
								wordList.remove(newWord);
							}
						}
						
						arrWord[i] = c;
					}
				}
			}
		}
		return 0;
	}
}
