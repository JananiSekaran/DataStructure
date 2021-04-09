package com.practice.interview.bit.fb;

public class ImplementPowerFunction {

	public static void main(String[] args) {
		int x = 2, n = 4, d = 20;

		System.out.println(pow(x,n,d));
	}

	public static int pow(int x, int n, int d) {

		int powerValue=x;
		 boolean isNegative = x<0?true:false;
	        if(isNegative)
	        {
	            x=x*-1;
	        }
		
		for(int i=1;i<n;i++)
		{
			powerValue=powerValue*x;
		}
		return isNegative? (powerValue%d)*-1 :powerValue%d;

	}
}
