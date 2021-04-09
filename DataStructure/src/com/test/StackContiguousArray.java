package com.test;

import java.util.Arrays;
import java.util.Stack;

public class StackContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 3, 4, 1, 6, 2 };

		System.out.println(Arrays.toString(countOfSubArray(arr)));
		System.out.println(Arrays.toString(contiguousSubArray(arr)));
	}

	private static int[] countOfSubArray(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				ans[i] += ans[stack.pop()];
			}
			stack.push(i);
			ans[i]++;
		}
		stack.clear();

		int[] temp = new int[arr.length];
		int idex;
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				idex = stack.pop();
				ans[i] += temp[idex];
				temp[i] += temp[idex];
			}

			stack.push(i);
			temp[i]++;
		}

		return ans;
	}

	static int[] contiguousSubArray(int[] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			result[i] = 1;
		
		
		for (int i = 0; i < arr.length; i++) {
			int left = i - 1;
			int right = i + 1;
			int current = arr[i];

			while (left >= 0 && current > arr[left]) {
				result[i]++;
				left--;
			}

			while (right < arr.length && current > arr[right]) {
				result[i]++;
				right++;

			}
		}

		return result;
	}

}
