package com.interview.mock;

public class PowerOfN {

	public static void main(String[] args) {

		System.out.println(powerOf(2, 3, 3));
	}

	private static double powerOf(int value, int power, int k) {
		double result = 0.0;
		
		result=Math.pow(value, power);
		result=result%k;
		
	
		return result>0?result:0.0;
	}

}
