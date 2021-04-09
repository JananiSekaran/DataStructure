package com.interview.mock;

public class RowOfSeats {

	public static void main(String[] args) {

		String str = ". . . . x . . x x .  .  .  x  .  .";
		System.out.println(String.valueOf(process(str)));
	}

	private static int process(String str) {
		int mod = 0;
		int count = 0;

		int startingIndex, endingIndex;
		int countStartingIndex = 0, countEndingIndex = 0;
		;
		for (Character c : str.toCharArray()) {
			if (c == '.') {
				endingIndex = str.indexOf(c);
				countEndingIndex = endingIndex++;
			} else if (c == 'x') {
				startingIndex = str.indexOf(c);
				countStartingIndex = startingIndex++;
			}

		}

		return mod;
	}

}
