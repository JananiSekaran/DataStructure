package com.exercise.string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		char[] s= {'h','e','l','l','o'};
		System.out.println(Arrays.toString(s));

		reverseString(s);
		
		char[] s1= {'h','e','l','l','o'};

		revereStringNew(s1);
	}

	private static void reverseString(char[] s) {
		int n=s.length;
		char temp;
		for(int i=0;i<n/2;i++)
		{
			temp=s[i];
			s[i]=s[n-1-i];
			s[n-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(s));
	}
	
	private static void revereStringNew(char[] s)
	{
		for(int i=s.length-1;i>=0;i--)
			System.out.print(s[i]+" ");
	}
	
}
