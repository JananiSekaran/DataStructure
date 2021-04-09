package com.practice.fb.questions;

public class RationalCipher {

	public static void main(String[] args) {
		String str = "Zebra-493?";
		int rationalFactor = 3;
		System.out.println(convertRationalCipher(str, rationalFactor));
	}

	private static String convertRationalCipher(String str, int rationalFactor) {
		char[] data = str.toCharArray();
		String result = "";
		for (int i = 0; i < data.length; i++) {

			if (Character.isAlphabetic(data[i])) {
				if (Character.isUpperCase(data[i])) {

					char res = (char) (int) (((data[i] + rationalFactor) - 65) % 26 + 65);

					result += res;

				}

				else if (!Character.isUpperCase(data[i])) {

					result += (char) (int) (((data[i] + rationalFactor) - 97) % 26 + 97);

				}

			} else if (Character.isDigit(data[i])) {
				int value = Character.getNumericValue(data[i]);
				int temp = 1;
				result += value < 10 ? value + rationalFactor : temp + rationalFactor;
			} else if (!Character.isLetterOrDigit(data[i])) {
				result += data[i];
			}
		}

		return result;
	}

}
