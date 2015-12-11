package com.array;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.util.Interval;

public class InsertIntervalTest {
	InsertInterval obj = new InsertInterval();
	@Test
	public void test() {

		Interval i2 = new Interval(2,6);
		Interval i3 = new Interval(8,10);
		Interval i4 = new Interval(15,18);
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
		
		Interval newInterval = new Interval(5,9);
		
		
		
		ArrayList<Interval> results = new ArrayList<Interval>();
		results.add(new Interval(2,10));
		results.add(new Interval(15,18));
		
		
		ArrayList<Interval> results1 = obj.insert(intervals, newInterval);
		assertTrue(results.size() == results1.size());
		for(int i=0;i<results.size();i++){
			if(!results.get(i).equals(results1.get(i))){
				assertTrue(false);
			}
		}
		assertTrue(true);
	}

}
