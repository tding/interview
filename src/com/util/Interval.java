package com.util;

public class Interval{
	public int start;
	public int end;
	
	public Interval(int s, int e){
		this.start = s;
		this.end = e;
	}
	
	public boolean equals(Interval b){
		if(this.start == b.start && this.end == b.end){
			return true;
		}
		return false;
	}
	
}