package com.test;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3,0,0,0 };
		int[] nums2 = { 7, 15, 60 };

		//System.out.println(Arrays.toString(mergeSortArray(nums1, nums2)));
		mergeSortArrayNew(nums1, nums2);

	}

	/*
	 * private static int[] mergeSortArray(int[] a, int[] b) {
	 * 
	 * int[] result=new int[a.length+b.length];
	 * 
	 * System.arraycopy(a, 0, result, 0, a.length); System.arraycopy(b, 0, result,
	 * a.length, b.length);
	 * 
	 * Arrays.sort(result);
	 * 
	 * return result; }
	 */
	private static int[] mergeSortArray(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length)
			result[k++] = a[i] < b[j] ? a[i++] : b[j++];

		while (i < a.length)
			result[k++] = a[i++];

		while (j < b.length)
			result[k++] = b[j++];

		
		return result;
	}
	private static void mergeSortArrayNew(int[] a, int[] b) {
		int[] filterArray=Arrays.stream(a).filter(num->num!=0).toArray();
		int[] filterArrayB=Arrays.stream(b).filter(num->num!=0).toArray();

		
		int[] result = new int[filterArray.length +filterArrayB.length];
		int i = 0, j = 0, k = 0;

		while (i < filterArray.length && j < filterArrayB.length)
			result[k++] = filterArray[i] < filterArrayB[j] ? filterArray[i++] : filterArrayB[j++];

		while (i < filterArray.length)
			result[k++] =filterArray[i++];

		while (j < filterArrayB.length)
			result[k++] =filterArrayB[j++];

		
		
		System.out.println(Arrays.toString(result));
	}


}
