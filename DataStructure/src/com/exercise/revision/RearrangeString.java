package com.exercise.revision;

import java.util.Arrays;

public class RearrangeString {

	public static void main(String[] args) {
		String str="AC2BEW3";
		
		int count=0;
		String result="";
		char[] chArr=str.toCharArray();
		Arrays.sort(chArr);
		for(int i=0;i<chArr.length;i++)
		{
		    	char ch=chArr[i];
		    if(Character.isDigit(ch))
		    {
		        count+=Integer.parseInt(String.valueOf(ch));
		    }
		    if(Character.isAlphabetic(ch))
		    {
		         result+=String.valueOf(ch);
		    }
		}
		result+=""+count;
		System.out.println(result);
	}

}
