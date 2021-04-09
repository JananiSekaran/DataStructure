package com.exercise.others;

public class MissingNumber {

	public static void main(String[] args) {

		int [] arr= {1,2,3,5};
		
		System.out.println("missing number "+missingNumber(arr));
		System.out.println(missingNumberNew(arr));
		
	}

	private static int missingNumber(int[] arr) {

		int n=arr.length;
		int total=0;
		
		total=(n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
			total-=arr[i];
		
		return total;
	}
	
	private static int missingNumberNew(int[] arr) {

		int n=arr.length+1;
		int total=0;
		
		
		for(int i=0;i<arr.length;i++)
			total+=arr[i];
		
		return (n*(n+1))/2-total;
	}

}
