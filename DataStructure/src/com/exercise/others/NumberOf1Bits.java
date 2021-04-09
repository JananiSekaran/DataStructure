package com.exercise.others;

public class NumberOf1Bits {

	public static void main(String[] args) {
		int n = 000000001101;
		//System.out.println(Integer.bitCount(n));
		int count=0;
		
		while(n!=0)
		{
			n=n&n-1;
			count++;
		}
		System.out.println(count);
	}

}
