package com.test;

import java.util.Arrays;

public class FindingLongestSubarraySum {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5, 0, 0, 0, 6, 7, 8, 9, 10 };
		int s = 15;

		System.out.println(Arrays.toString(findLongestSubArraySum(arr, s)));

	}

	private static int[] findLongestSubArraySum(int[] arr, int s) {
		// TODO Auto-generated method stub
		int[] result = new int[] { -1 };
		int left = 0;
		int right = 0;
		int sum = 0;

		while (right < arr.length) {
			sum += arr[right];

			while (left < right && sum > s) {
				sum -= arr[left++];
			}

			if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
				result = new int[] { left + 1, right + 1 };
			}

			right++;

		}

		return result;
	}
}
