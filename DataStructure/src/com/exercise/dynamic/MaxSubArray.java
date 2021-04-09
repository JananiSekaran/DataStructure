package com.exercise.dynamic;

public class MaxSubArray {

	public static void main(String[] args) {

		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxProfit(nums));
		
	}

	private static int maxProfit(int[] nums) {

		if(nums==null)
			return 0;
		
		int sum=nums[0];
		int maxprofit=nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			sum=Math.max(nums[i], sum+nums[i]);
			maxprofit=Math.max(sum, maxprofit); 
		}
		
		return maxprofit;
	}

}
