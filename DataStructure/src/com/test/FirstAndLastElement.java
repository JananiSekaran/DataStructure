package com.test;

import java.util.Arrays;

public class FirstAndLastElement {
	public static void main(String args[]) {
		int arr[] = { 5, 7, 7, 8, 8,8,8,8, 10 };
		int target = 8;
		int[] result = new int[2];
		result[0] = findFirstIndex(arr, target);
		result[1] = findLastIndnex(arr, target);

		
		System.out.println(Arrays.toString(result));
	}

	private static int findFirstIndex(int[] arr, int target) {
		int index = -1;
		int start=0;
		int end =arr.length-1;
		int midpoint=0;
		while(start<=end)
		{
			midpoint=start+(end-start)/2;
			
			if(arr[midpoint]>=target)
			{
				end=midpoint-1;
			}
			else
			{
				start=midpoint+1;
			}
			
			if(arr[midpoint]==target)
				index=midpoint;
			
		}
		return index;
	}

	private static int findLastIndnex(int[] arr, int target) {
		int index = -1;
		int start=0;
		int end =arr.length-1;
		int midpoint=0;
		while(start<=end)
		{
			midpoint=start+(end-start)/2;
			
			if(arr[midpoint]<=target)
			{
				start=midpoint+1;
			}
			else
			{
				end=midpoint-1;
			}
			
			if(arr[midpoint]==target)
				index=midpoint;
			
		}
		return index;
	}
}
