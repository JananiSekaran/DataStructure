package com.book;

public class SquareRootOfN {

	public static void main(String[] args) {

		int x = 11;
		System.out.println(sqrtRootOfN(x));
		System.out.println(sqrtRootOfNValue(x));

	}

	private static int sqrtRootOfN(int x) {

		if(x==0 || x==1)
			return x;
		
		int i=1,result=1;
		while(result<=x)
		{
			i++;
			result=i*i;
		}
		
		return i-1;
	}
	
	private static int sqrtRootOfNValue(int x)
	{
		if(x==0 || x==1)
			return x;
		
		
		int start=1,end=x,ans=0;
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(mid*mid==x)
				return mid;
			else if(mid*mid<x)
			{
				start=mid+1;
				ans=mid;
			}
			else
			{
				end=mid-1;
			}
		}
		return ans;
	}

}
