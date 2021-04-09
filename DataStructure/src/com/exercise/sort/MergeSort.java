package com.exercise.sort;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 10, 3, 2, 5, 7, 6, 9 };

		sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);
	}

	private static void sort(int[] arr, int i, int n) {

		if (i < n) {
			int mid = (i + n) / 2;

			sort(arr, i, mid);
			sort(arr, mid + 1, n);
			mergeSort(arr, i, mid, n);
		}

	}

	private static void mergeSort(int[] arr, int i, int mid, int n) {

		System.out.print(" --" + i + "mid" + mid);
		System.out.println("");
		int size1 = mid - i + 1;
		int size2 = n - mid;

		int[] firstPart = new int[size1];
		int[] secondPart = new int[size2];
		for (int l = 0; l < size1; l++) {
			firstPart[l] = arr[i + l];
		}

		for (int r = 0; r < size2; r++) {
			secondPart[r] = arr[mid + r + 1];
		}

		int f1 = 0, f2 = 0, k = i;

		while (f1 < size1 && f2 < size2) {

			if (firstPart[f1] <= secondPart[f2]) {
				arr[k] = firstPart[f1];

				f1++;

			} else {
				arr[k] = secondPart[f2];
				f2++;

			}
			k++;
		}

		while (f1 < size1) {
			arr[k] = firstPart[f1];
			f1++;
			k++;
		}
		while (f2 < size2) {
			arr[k] = secondPart[f2];
			f2++;
			k++;
		}

	}

}
