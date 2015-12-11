package com.array;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import com.util.Interval;


public class MergeIntervalsTest {
	MergeIntervals obj = new MergeIntervals();
	@Test
	public void test() {
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,6);
		Interval i3 = new Interval(8,10);
		Interval i4 = new Interval(15,18);
		ArrayList<Interval> list = new ArrayList<Interval>();
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		
		Interval a1 = new Interval(1,6);
		Interval a2 = new Interval(8,10);
		Interval a3 = new Interval(15,18);
		
		ArrayList<Interval> results = new ArrayList<Interval>();
		results.add(a1);
		results.add(a2);
		results.add(a3);
		ArrayList<Interval> results1 = obj.merge(list);
		
		assertTrue(results.size() == results1.size());
		
		for(int i=0;i<results.size();i++){
			if(!results.get(i).equals(results1.get(i))){
				assertTrue(false);
			}
		}
		assertTrue(true);
		
		
	}
	


}
