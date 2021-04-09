package com.exercise.others;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {

		String str="{}[]";
		System.out.println(isValidParanthesis(str));
	}

	private static boolean isValidParanthesis(String str) {
		 Stack<Character> stack=new Stack<>();
	        HashMap<Character,Character> map=new HashMap<>();
	        map.put('(',')');
	        map.put('{','}');
	        map.put('[',']');
	        
	        for(int i=0;i<str.length();i++)
	        {
	        	char cur=str.charAt(i);
	        	
	        	if(map.keySet().contains(cur))
	        	{
	        		stack.push(cur);
	        	}
	        	else if(map.values().contains(cur))
	        	{
	        		if(!stack.isEmpty() && map.get(stack.peek())==cur)
	        		{
	        			stack.pop();
	        		}
	        		else
	        		{
	        			return false;
	        		}
	        	}
	        }
	        
		return stack.isEmpty();
	}

}
