package com.exercise.string;

public class ReverseInteger {

	public static void main(String[] args) {

		
		int number=1539;
		System.out.println("number before reverse "+number);
		number = reverseNumber(number);
			
		System.out.println("number "+number);
		
		
	}

	private static int reverseNumber(int number) {
		boolean isNegative=number<0?true:false;
		if(isNegative)
		{
			number=number*-1;
		}
		int reverse=0;
		
		while(number!=0)
		{/*
			digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
			
		*/
			reverse = reverse * 10;
			reverse = reverse + number%10;
			number = number/10;	
		}
		return isNegative==true?reverse*-1:reverse;
	}

}
