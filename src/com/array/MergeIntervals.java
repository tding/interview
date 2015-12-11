package com.array;

import java.util.ArrayList;
import java.util.Comparator;

import com.util.Interval;
import com.util.IntervalComparator;

import java.util.Collections;


public class MergeIntervals {
	/*
	 * Given a collection of intervals, merge all overlapping intervals.
	   For example,
	   Given [1,3],[2,6],[8,10],[15,18],
       return [1,6],[8,10],[15,18].
	 */
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals){
		if(intervals.size() <= 1) return intervals;
		
		ArrayList<Interval> results = new ArrayList<Interval>();
		Collections.sort(intervals,new IntervalComparator());
		
		Interval pre = intervals.get(0);

		for(int i=1;i<intervals.size();i++){
			Interval cur = intervals.get(i);
			if(pre.end >= cur.start){
				Interval newInterval = new Interval(pre.start,Math.max(pre.end, cur.end));
				pre = newInterval;
			}
			else{
				results.add(pre);
				pre = cur;
				
			}
		}
		results.add(pre);
		
		return results;
	}
	
	
}
