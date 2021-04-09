package com.book;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int n = arr.length;
		int target = 4;

		// System.out.println(count(arr, n, target));
		// System.out.println(countDP(arr, n, target));
		System.out.println(countWays(arr, n, target));

	}

	private static int count(int[] arr, int n, int target) {

		if (target == 0)
			return 1;
		if (target < 0)
			return 0;
		if (n <= 0 && target >= 1)
			return 0;
		return count(arr, n - 1, target) + count(arr, n, target - arr[n - 1]);
	}

	private static int countDP(int[] arr, int n, int target) {
		int[] table = new int[target + 1];
		Arrays.fill(table, 0);
		table[0] = 1;
		for (int i = 0; i < n; i++)
			for (int j = arr[i]; j <= target; j++)
				table[j] += table[j - arr[i]];

		return table[target];
	}

	static int countWays(int arr[], int n, int target) {
		// Time complexity of this function: O(mn)
		// Space Complexity of this function: O(n)

		// table[i] will be storing the number of solutions
		// for value i. We need n+1 rows as the table is
		// constructed in bottom up manner using the base
		// case (n = 0)
		int[] table = new int[target + 1];

		// Initialize all table values as 0
		Arrays.fill(table, 0); // O(n)

		// Base case (If given value is 0)
		table[0] = 1;

		// Pick all coins one by one and update the table[]
		// values after the index greater than or equal to
		// the value of the picked coin
		for (int i = 0; i < n; i++)
			for (int j = arr[i]; j <= target; j++) {
				table[j] += table[j - arr[i]];

			}

		return table[target];
	}
}
