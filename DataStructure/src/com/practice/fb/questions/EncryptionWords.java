package com.practice.fb.questions;

public class EncryptionWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcd";
		String s="facebook";
		System.out.println(findEncryptedWord(s));
	}
	
	static String findEncryptedWord(String s) {
		// Write your code here
		String result = "";
		if (s == null || s.length() <= 0)
			return "";

		if (s.length() == 1)
			return s;

		int mid=(s.length()%2==0)?((s.length()) / 2) : ((s.length() - 1) / 2);
		
		char[] val = s.toCharArray();
		result += val[mid];

		return result + findEncryptedWord(s.substring(0, mid)) + findEncryptedWord(s.substring(mid + 1));
	}
	
	//https://helloacm.com/recursive-algorithm-to-encrypte-a-string/
	//https://www.facebookrecruiting.com/portal/coding_practice_question/?problem_id=223547538732703

}
