package com.array;

import java.util.HashMap;

public class TwoSumII {
	HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
	
	public void add(int i){
		if(map.containsKey(i)){
			map.put(i, map.get(i)+1);
		}
		else{
			map.put(i, 1);
		}
	}
	
	public boolean find(int target){
		for(Integer i: map.keySet()){
			int value = target - i;
			if(map.containsKey(value)){
				if(value != i){
					return true;
				}
				else if(map.get(value) >= 2){
					return true;
				}
			}
		}
		return false;
	}
	
}
