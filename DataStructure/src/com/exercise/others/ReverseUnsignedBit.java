package com.exercise.others;

public class ReverseUnsignedBit {

	public static void main(String[] args) {
		int n = 100;
		System.out.println(reverseBit(n));
		System.out.println(reverseBitNew(n));
	}

	private static int reverseBitNew(int n) {
		int reverse=0;
		for(int i=0;i<32;i++, n>>=1)
			reverse= (reverse<<1) | (n&1);
		
		return reverse;
	}

	private static int reverseBit(int n) {
		return Integer.reverse(n);
			
	}

}
