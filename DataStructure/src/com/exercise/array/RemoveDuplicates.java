package com.exercise.array;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 2 };
		int n = removeDuplicatesFromList(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	private static int removeDuplicatesFromList(int[] arr) {
		int n = arr.length;
		
		if(n==0 || n==1)
			return n;
		
		int j = 0;
		int[] temp = new int[n];

	
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++)
			arr[i] = temp[i];

		return j;
	}
	/*
	 * static int removeDuplicatesFromList(int arr[]) { int n = arr.length; //
	 * Return, if array is empty // or contains a single element if (n==0 || n==1)
	 * return n;
	 * 
	 * int[] temp = new int[n];
	 * 
	 * // Start traversing elements int j = 0; for (int i=0; i<n-1; i++) // If
	 * current element is not equal // to next element then store that // current
	 * element if (arr[i] != arr[i+1]) temp[j++] = arr[i];
	 * 
	 * // Store the last element as whether // it is unique or repeated, it hasn't
	 * // stored previously temp[j++] = arr[n-1];
	 * 
	 * // Modify original array for (int i=0; i<j; i++) arr[i] = temp[i];
	 * 
	 * return j; }
	 */

}
