package com.exercise.string;

public class ImplementstrStr {

	public static void main(String[] args) {

		String haystack = "hello";
		String needle = "llo";
		System.out.println(strStr(haystack,needle));
	}

	private static int strStr(String haystack, String needle) {

		if(needle.length()==0)
			return 0;
		if(haystack.length()==0 || haystack.length()<needle.length())
			return -1;
		for(int i=0;i<haystack.length();i++)
		{
			for(int j=0;j<needle.length() && i+j<haystack.length();j++)
			{
				if(needle.charAt(j) != haystack.charAt(i+j))
				{
					break;
				}
				else if(j==needle.length()-1)
				{
					return i;
					
				}
				
			}
		}
		
		
		return -1;
	}

}
