package com.exercise.design;

public class CountPrimes {

	public static void main(String[] args) {

		int n = 8;
		System.out.println(countPrimesLessThan10(n));
		System.out.println(countPrimeNumber(n));
	}

	static int countPrimeNumber(int n) {
		int count = 0;

		
		for (int i = 1; i < n-1; i++) {
			boolean	isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
			}
		}

		return count;
	}

	private static int countPrimesLessThan10(int n) {
		int count = 0;
		boolean[] prime = new boolean[n];
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int i = 2; i * i < n; i++) {
			if (prime[i]) {
				for (int j = i; j * i < n; j++)
					prime[i * j] = false;
			}
		}

		for (int i = 2; i < n; i++)
			if (prime[i])
				count++;

		return count;
	}

}
