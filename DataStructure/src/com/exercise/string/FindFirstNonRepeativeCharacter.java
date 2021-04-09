package com.exercise.string;

public class FindFirstNonRepeativeCharacter {

	public static void main(String[] args) {

		String s = "eetlcode";

		System.out.println(fetchFirstNonRepeativeCharacter(s));
	}

	private static int fetchFirstNonRepeativeCharacter(String s) {
		for (Character c : s.toCharArray()) {

			if (s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println(c);
				return s.indexOf(c);
			}
		}

		return -1;
	}

}
