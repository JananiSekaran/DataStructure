package com.exercise.array;

import java.util.Arrays;

public class ContainsDuplicatesOrNot {

	public static void main(String[] args) {

		int[] arr=new int[] {1,2,3,4};
		
		System.out.println(containsDuplicate(arr));
	}

	private static boolean containsDuplicate(int[] arr) {
		boolean result=false;
		int n=arr.length;
		
		if(n==0 || n==1)
            result=false;
            
		else{
		Arrays.sort(arr);
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
				result=true;
		}
		}
		return result;
	}

}
