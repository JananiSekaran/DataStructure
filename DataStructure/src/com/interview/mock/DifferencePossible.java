package com.interview.mock;

import java.util.Arrays;

public class DifferencePossible {

	/**
	 * @input A : Read only ( DON'T MODIFY ) Integer array
	 * @input n : Integer array's ( A ) length
	 * @input k : Integer
	 * 
	 * @Output Integer
	 */
	public static void main(String[] args) {

		int[] arr = { 1, 5, 3 };
		int k = 2;
		int n=arr.length;

		System.out.println(differenceIfPossible(arr, k,n));
	}

	private static int differenceIfPossible(int[] arr, int k,int n) {
		if (n == 0)
			return 0;

		int diff = 0;

		// Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++)
			for (int j = 1; j <n; j++) {
				if (arr[j] >= arr[i]) {
					diff = arr[j] - arr[i];

				} else if (arr[i] > arr[j]) {
					diff = arr[i] - arr[j];

				}

				if (diff == k) {
					return 1;
				}

			}

		return 0;
	}

}
