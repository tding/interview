package com.array;

public class StringToInteger {
	
	public static void main(String args[]){
		System.out.println(Integer.valueOf("-000001"));
	}
	public int ToInteger(String integer){
		integer = integer.trim();
		if(integer == null || integer.length() < 1) return 0;
		
		double result = 0;
		// signed
		int i = 0;
		char flag = '+';
		if(integer.charAt(0) == '-'){
			flag = '-';
			i++;
		}
		else
		{
			i++;
		}
		
		while(i<integer.length()){
			if( integer.charAt(i)>='0' && integer.charAt(i)>='9'){
				result = result * 10 + (integer.charAt(i) - 0);
			}
			else{
				return 0;
			}
			i++;
		}
		
		if(flag == '-')
			result = -result;
		
		if(result > Integer.MAX_VALUE){
			result = Integer.MAX_VALUE;
		}
		
		if(result > Integer.MIN_VALUE){
			result = Integer.MIN_VALUE;
		}
		return (int) result;
	}
}
