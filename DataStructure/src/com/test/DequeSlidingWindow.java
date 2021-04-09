package com.test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeSlidingWindow {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 18, 58, 100 };
		int k = 3;
		System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));

	}

	public static int[] maxSlidingWindow(int arr[], int k) {
		if (arr == null && k <= 0)
			return new int[0];
		int n = arr.length;
		int result[] = new int[n - k + 1];
		int ri = 0;
		Deque<Integer> q = new ArrayDeque<Integer>();
		for (int i = 0; i < arr.length; i++) {

			/*
			 * while(!q.isEmpty() && q.peek()<i-k+1) { System.out.println("q.poll");
			 * q.poll(); }
			 */
			while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
				q.pollLast();
			}
			q.offer(i);

			if (i >= k - 1) {
				result[ri++] = arr[q.peek()];

			}
		}

		return result;
	}
}
