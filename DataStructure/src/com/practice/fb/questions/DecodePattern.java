package com.practice.fb.questions;

public class DecodePattern {

	public static void main(String[] args) {
		int[] value = { 2, 2, 3 };
		int [] output=new int[value.length];
		for(int i=0;i<value.length;i++)
		{
			int temp=value[i];
			while(temp>=0)
			{
				output[temp]=1;
				temp--;
				
			}
			
				
		}
	}

}
