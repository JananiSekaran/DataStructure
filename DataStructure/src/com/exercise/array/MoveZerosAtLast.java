package com.exercise.array;

import java.util.Arrays;

public class MoveZerosAtLast {

	public static void main(String[] args) {

		int[] arr= {0,1,3,0,0,5,7};
		moveZeroAtLast(arr);
	}

	private static void moveZeroAtLast(int[] arr) {
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		
		while(count<n)
			arr[count++]=0;
		System.out.println(Arrays.toString(arr));
	}

}
