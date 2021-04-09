package com.practice.interview.bit.fb;

public class FriendsPairingProgram {
	/*
	 * https://www.geeksforgeeks.org/friends-pairing-problem/
	 */ public static void main(String[] args) {
		int n = 3;
		System.out.println(numberOfFriendsPairing(n));
	}

	private static int numberOfFriendsPairing(int n) {

		int[] dp=new int[n+1];
		
		for(int i=0;i<=n;i++)
		{
			if(i<=2)
				dp[i]=i;
			else
				dp[i]=dp[i-1]+(n-1)*dp[i-2];
		}
			
		return dp[n];
	}

}
