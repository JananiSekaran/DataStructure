package com.exercise.array;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {

		int arr[]= {4,3,2,1};
		System.out.println("value "+Arrays.toString(plusOne(arr)));
		
	}
	
	 static int[] plusOne(int[] digits) {
	        int n=digits.length;
	        int[] temp=new int[digits.length];
	        if(n==1)
	        {
	            temp[0]=digits[0]+1;
	            
	        }
	        else{
	        for(int i=0;i<n;i++)
	        {
	            if(i<n-1)
	            temp[i]=digits[i];
	            else
	                temp[i]=digits[i]+1;
	        }
	        }
	       return temp;
	    }

}
