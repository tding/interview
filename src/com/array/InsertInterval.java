package com.array;

import java.util.ArrayList;

import com.util.Interval;

public class InsertInterval {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval){
		ArrayList<Interval> result = new ArrayList<Interval>();
		
		for(int i=0;i<intervals.size();i++){
			Interval cur = intervals.get(i);
			if(cur.start > newInterval.end){
				result.add(newInterval);
				newInterval = cur;
			}
			else if(cur.end < newInterval.start){
				result.add(cur);
			}
			else if(cur.start <= newInterval.end || cur.end >= newInterval.start){
				newInterval = new Interval(Math.min(cur.start, newInterval.start),Math.max(cur.end, newInterval.end));
				
			}
		}
		result.add(newInterval);
		return result;
	}
}
