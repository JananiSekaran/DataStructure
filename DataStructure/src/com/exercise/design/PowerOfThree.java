package com.exercise.design;

public class PowerOfThree {

	public static void main(String[] args) {

		int n = 27;
		System.out.println(IsPowerOf3(n));

	}

	private static boolean IsPowerOf3(int n) {
		boolean result=false;
		if(n==1)
			return true;
		
		while(n>0)
		{
			int m=n%3;
			if(m==0)
			{
				n=n/3;
				if(n==1)
					return true;
			}
			else
			{
				return false;
			}
		}
		
		return result;
	}

}
