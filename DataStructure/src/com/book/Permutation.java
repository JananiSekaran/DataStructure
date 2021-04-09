package com.book;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		permutation(str, "");
	}

	private static void permutation(String str, String prefix) {

		if (str.length() == 0)
			System.out.println(prefix);

		for (int i = 0; i < str.length(); i++) {
		
			String prem = str.substring(0, i) + str.substring(i + 1);
			permutation(prem, prefix + str.charAt(i));
		}

	}

}
