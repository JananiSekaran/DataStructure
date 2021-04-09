package com.practice.fb.questions;

public class MinimumLengthSubString {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minimumLengthOfSubString(s, t));
	}

	private static int minimumLengthOfSubString(String s, String t) {
		if (s.length() == 0 || t.length() == 0)
			return -1;

		int count = 0;
		char sChar[] = s.toCharArray();
		char tChar[] = t.toCharArray();
		int start = 0;
		int end = 0;
		boolean visited = false;
		for (int i = 0; i < sChar.length; i++) {
			for (int j = 0; j < tChar.length; j++) {
				if (sChar[i] == tChar[j]) {
					start = i;
					visited = true;

				} else if (visited && sChar[i] == tChar[j]) {
					end = i;
				}
			}

		}

		count = start + end + 1;

		return count;
	}

}
