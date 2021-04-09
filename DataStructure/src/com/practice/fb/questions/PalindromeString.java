package com.practice.fb.questions;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "abbau";
		String reverse = "";

		for (int i = s.length()-1; i >= 0; i--)
			reverse += s.charAt(i);
		
	if(s.equals(reverse))
		System.out.println("its palindrome");
	else
		System.out.println("not palindrome");

	}

}
