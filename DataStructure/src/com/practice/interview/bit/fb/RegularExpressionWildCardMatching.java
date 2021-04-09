package com.practice.interview.bit.fb;

public class RegularExpressionWildCardMatching {
	/*
	 * https://www.geeksforgeeks.org/wildcard-pattern-matching/
	 * 
	 * The wildcard pattern can include the characters ‘?’ and ‘*’ ‘?’ – matches any
	 * single character ‘*’ – Matches any sequence of characters (including the
	 * empty sequence)
	 * 	https://www.programcreek.com/2014/06/leetcode-wildcard-matching-java/
	 */ public static void main(String[] args) {
		String str = "baaabab";
		String pattern = "*****ba*****ab";
		System.out.println(isMatch(str, pattern));
	}

	private static boolean isMatch(String str, String pattern) {

		int i = 0, j = 0, iIndex = -1, startIndex = -1;

		while (i < str.length()) {

			if (j < pattern.length() && (pattern.charAt(j) == '?' || str.charAt(i) == pattern.charAt(j))) {
				i++;
				j++;
			} else if (j < pattern.length() && pattern.charAt(j) == '*') {
				startIndex = j;
				iIndex = i;
				j++;

			}
			else if(startIndex!=-1)
			{
				j=startIndex++;
				i=iIndex+1;
				iIndex++;
			}
			else 
			{
				return false;
			}
		}
		
		while(j<pattern.length() && pattern.charAt(j)=='*')
		{
			j++;
		}
		return j==pattern.length();
	}

}
