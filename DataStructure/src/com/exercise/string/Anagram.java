package com.exercise.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("rat", "cat"));
	}
	 public static boolean isAnagram(String s, String t) {
	        
	       char[] firstWord=s.replaceAll("//s","").toCharArray();
	        char[] secondWord=t.replaceAll("//s","").toCharArray();
	        Arrays.sort(firstWord);
	        Arrays.sort(secondWord);
	        return Arrays.equals(firstWord,secondWord);
	    }
}
