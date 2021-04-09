package com.exercise.string;

public class Palindrome {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		//System.out.println(isPanlidrome(s));
		System.out.println(isPanlidromeValue(s));

	}

	private static boolean isPanlidrome(String s) {
		if (s == null)
			return false;
		s = s.toLowerCase();// important line
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			while (i < j && !((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))) // need
																															// to
																															// add
																															// <=
																															// and
																															// single
																															// quotes
																															// for
																															// value
			{
				i++;
			}
			while (i < j
					&& !((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))) {
				j--;
			}

			if (s.charAt(i) != s.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

	private static boolean isPanlidromeValue(String str) {
		String input=str.toLowerCase();
		input=input.replaceAll("[^a-z0-9]|\\s", "");
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
