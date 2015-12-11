package com.util;

import java.util.Comparator;


public class IntervalComparator implements Comparator<Interval>{
	@Override
	public int compare(Interval o1, Interval o2) {
		// TODO Auto-generated method stub
		return o1.start - o2.start;
	}
	
}
