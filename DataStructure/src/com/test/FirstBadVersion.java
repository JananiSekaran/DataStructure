package com.test;


public class FirstBadVersion {
	// https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
	public static void main(String[] args) {

		System.out.println(firstBadVersion(5));
	}

	private static int firstBadVersion(int n) {
		int left = 0;
		int right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			/*if (isBadversion(mid))
				right = mid;
			else
				left = mid + 1;*/

		}
		/*if (left == right && isBadVersion(left)) {
			return left;
		}*/
		return -1;
	}

}
