package com.exercise.string;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = { "flower", "flow", "flight" };
		// System.out.println(findLongestCommonPrefix(str));
		System.out.println(longestCommonPrefix(str));
	}
/*
	private static String findLongestCommonPrefix(String[] str) {

		if (str == null || str.length == 0)
			return "";
		if (str.length == 1)
			return str[0];

		int i = 1;
		boolean flag = false;

		while (true) {

			flag = true;

			for (int j = 1; j < str.length; j++) {
				if (str[j].length() <= i && str[j - 1].length() <= i || str[j].charAt(i) != str[j - 1].charAt(i)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				i++;
			} else {
				break;
			}
		}

		return str[0].substring(0, i);
	}
*/
	public static String longestCommonPrefix(String[] s) {
		if (s.length == 0)
			return "";

		String prefix = s[0];
		for (int i = 1; i < s.length; i++) {
			while (s[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.equals(""))
					return "";
			}
		}
		return prefix;
	}
}
