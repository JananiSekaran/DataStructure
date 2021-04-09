package com.book;

public class PowerOf2 {

	public static void main(String[] args) {

		int n = 50;
		powerOf2(n);
	}

	private static int powerOf2(int n) {
		if (n < 1)
			return 0;
		else if (n == 1) {
			System.out.println("1");
			return 1;
		} else {
			int prev = powerOf2(n / 2);
			int curr = prev * 2;
			System.out.println(curr);

			return curr;
		}
	}

}
