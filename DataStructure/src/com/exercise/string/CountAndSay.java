package com.exercise.string;

public class CountAndSay {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(countAndSay(n));
		System.out.println(">>" + countAndSayNew(n));
	}

	private static String countAndSay(int n) {
		if (n <= 0)
			return null;
		int i = 1;
		String result = "1";
		int count = 0;

		while (i < n) {
			StringBuilder sb = new StringBuilder();
			count = 1;

			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}

			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}

		return result;
	}

	private static String countAndSayNew(int n) {
		if (n <= 0)
			return "";
		String result = "1";
		while (n > 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < result.length(); i++) {
				int count = 1;

				while (i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)) {
					count++;
					i++;
				}
				sb.append(count).append(result.charAt(i));

			}
			result = sb.toString();
			n--;
		}

		return result;

	}
}
