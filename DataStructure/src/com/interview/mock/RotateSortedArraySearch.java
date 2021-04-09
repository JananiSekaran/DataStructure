package com.interview.mock;

public class RotateSortedArraySearch {

	public static void main(String[] args) {

		int[] a = { 4, 5, 6, 7, 0, 1, 2, 3 };
		int b = 59;
		System.out.println(seachValueFromArray(a, b));
	}

	private static int seachValueFromArray(int[] a, int b) {

		if(a.length==0)
			return -1;
		
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
				return i;
		}
			
		return -1;
	}

}
