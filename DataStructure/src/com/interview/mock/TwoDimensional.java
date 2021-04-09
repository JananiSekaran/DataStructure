package com.interview.mock;

public class TwoDimensional {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1 }, { 2, 2 }, { 3, 3 } };

		System.out.println(maxPointForPlan(arr));
	}

	private static int maxPointForPlan(int[][] arr) {
		int max = Integer.MIN_VALUE;
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}

		}

		return max;
	}

}
