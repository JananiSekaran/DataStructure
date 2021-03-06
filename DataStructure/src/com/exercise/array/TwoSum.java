package com.exercise.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int complement=0;
		for (int i = 0; i < nums.length; i++) {
			 complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
