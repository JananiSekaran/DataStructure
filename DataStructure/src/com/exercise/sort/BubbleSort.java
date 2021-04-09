package com.exercise.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 2 };
		System.out.println(Arrays.toString(bubbleSort(arr)));

	}

	private static int[] bubbleSort(int[] arr) {
		int[] result = new int[arr.length];

		if (arr.length == 0)
			return result;

		int n = arr.length;
		int temp;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for (int i = 0; i < n; i++)
			result[i] = arr[i];

		return result;
	}

}
