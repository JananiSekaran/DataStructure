package com.exercise.array;

public class MaxSubArray {
/*	https://www.programcreek.com/2013/02/leetcode-maximum-subarray-java/
*/	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSubArray(arr));
		System.out.println(maxSubArray1(arr));

	}

	static int maxSubArray(int[] arr) {
		int result = arr[0];
		int sum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			result = Math.max(sum, result);
		}

		return result;
	}

	static int maxSubArray1(int[] nums) {
		int result = nums[0];
		int[] sum = new int[nums.length];
		sum[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
			result = Math.max(result, sum[i]);
		}

		return result;
	}
}
