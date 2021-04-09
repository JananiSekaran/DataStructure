package com.exercise.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5, 2 };
		System.out.println(Arrays.toString(selectionSort(arr)));

	}

	private static int[] selectionSort(int[] arr) {

		int n = arr.length;
		int minIndex;
		int temp;
		for (int i = 0; i < n; i++) {
			minIndex = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;

					temp = arr[minIndex];
					arr[minIndex] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr;
	}

}
