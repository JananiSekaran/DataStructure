package com.exercise.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumberWithoutDuplicate {

	public static void main(String[] args) {
		//int[] arr=new int[]{2,2,1};
		int[] arr=new int[] {2, 3, 5, 4, 5, 3, 4,4,3};
		System.out.println(singleNumber(arr));

	}

	private static int singleNumber(int[] arr) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		
		for(int i:arr)
		{
			if(!set.add(i))
			{
				set.remove(i);
			}
		}
		Iterator<Integer> itr=set.iterator();
		return itr.next();
	}
	
	

	 /* public static int singleNumber(int[] nums) {
	        int n=nums.length;
	      
	        int result=nums[0];
	        
	        for(int i=1;i<n;i++)
	        	result=result^nums[i];
	            
	      
	        
	        return result;
	    }*/
}
