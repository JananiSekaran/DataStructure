package com.test;

import java.util.ArrayList;
import java.util.Vector;

public class MinimumNumberOfSeats {
	static int MOD = 10000003;

	public static void main(String[] args) {
		String s = ". . . . x . . x x . . . x . .";
		System.out.println(minJumps(s));

	}


	static int minJumps(String seats) {
		// Store the indexes
		Vector<Integer> position = new Vector<>();

		// Stores the count of
		// occupants
		int count = 0;

		// Length of the String
		int len = seats.length();

		// Traverse the seats
		for (int i = 0; i < len; i++) {
			// If current place is occupied
			if (seats.charAt(i) == 'x') {
				// Push the current position
				// in the vector
				position.add(i - count);
				count++;
			}
		}

		// Base Case:
		if (count == len || count == 0)
			return 0;

		// The index of the median
		// element
		int med_index = (count - 1) / 2;

		// The value of the median
		// element
		int med_val = position.get(med_index);

		int ans = 0;

		// Traverse the position[]
		for (int i = 0; i < position.size(); i++) {
			// Update the ans
			ans = (ans % MOD + Math.abs(position.get(i) - med_val) % MOD) % MOD;
		}

		// Return the final count
		return ans % MOD;
	}
}