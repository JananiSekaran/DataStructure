package com.exercise.dynamic;

public class ClaimStairs {

	public static void main(String[] args) {

		System.out.println(claimStairs(4));
		System.out.println(climbStairsNew(4));

	}

	private static int claimStairs(int n) {
		if(n<=1)
			return 1;
		
		int[] ways = new int[n + 1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=n;i++)
			ways[i]=ways[i-2]+ways[i-1];

		return ways[n];
	}
	//another way
	private static int climbStairsNew(int N)
	{
	    if ( N < 2 )
	        return 1;
	    else
	        return climbStairsNew(N-2) + climbStairsNew(N-1);
	}

}
