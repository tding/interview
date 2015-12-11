package com.array;

import java.util.Stack;

public class ReversePolishNotation {
	/*Evaluate the value of an arithmetic expression in Reverse Polish Notation. 
	Valid operators are +, -, *, /. Each operand may be an integer or another expression. For example:
	["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
	["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6 */
	
	public int evalRPN(String tokens[]){
		int result = 0;
		String operator = "*/+-";
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<tokens.length;i++){
			if(operator.contains(tokens[i])){
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				
				switch(tokens[i]){
					case "+": stack.push(operand1+operand2); break;
					case "-": stack.push(operand1-operand2); break;
					case "*": stack.push(operand1*operand2); break;
					case "/": stack.push(operand2/operand1); break;
				}
			}
			else{
				stack.push(Integer.valueOf(tokens[i]));
			}
		}
		
		return stack.pop();
	}
}
