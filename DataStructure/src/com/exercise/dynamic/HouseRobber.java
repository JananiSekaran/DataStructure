package com.exercise.dynamic;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = { 6, 7, 1, 3, 8, 2, 4 };
		System.out.println(houseRobber(nums));
	}

	private static int houseRobber(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 0;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = nums[0];

		for (int i = 1; i < n; i++) {
			dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);

		}
		return dp[n];
	}

}
